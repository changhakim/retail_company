package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class CustomerDAOImpl  implements CustomerDAO{

	private static CustomerDAO instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {}
	public static CustomerDAO getInstance() {return instance;}


	@Override
	public void insertCustomer(CustomerDTO customer) {
		try {
		
			String sql = CustomerSQL.CUSREGISTER.toString();
			Connection conn	=	DatabaseFactory.
								createDatabase(Vendor.ORACLE).
								getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, customer.getCustomerID());
							pstmt.setString(2, customer.getCustomerName());
							pstmt.setString(3, customer.getPassword());
							pstmt.setString(4, customer.getSsn());
							pstmt.setString(5, customer.getPhone());
							pstmt.setString(6, customer.getCity());
							pstmt.setString(7, customer.getAddress());
							pstmt.setString(8, customer.getPostalCode());
				pstmt.executeUpdate();	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<CustomerDTO> selectCustomerList(Proxy pxy) {
		List<CustomerDTO> list = new ArrayList<>();
		try {
			String sql = CustomerSQL.LIST.toString();
			Pagination page = ((PageProxy)pxy).getPage();
			PreparedStatement ps = DatabaseFactory
								   .createDatabase(Vendor.ORACLE)
								   .getConnection()
								   .prepareStatement(sql);
			
			ps.setInt(1, page.getStartRow());
			ps.setInt(2, page.getEndRow());
		
		ResultSet rs =	ps.executeQuery();
		
		CustomerDTO cust = null;
			while(rs.next()) {
				 
				cust = new CustomerDTO();
				cust.setCustomerID(rs.getString("CUSTOMER_ID"));
				cust.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cust.setNo(rs.getString("NO"));
				cust.setSsn(rs.getString("SSN"));
				switch (cust.getSsn().charAt(7)) {
				case '1': case'3':
					cust.setGender("남");
					
					break;
				case '2': case'4':
					cust.setGender("여");
					break;
				
				default:
					break;
				}
				
				cust.setPhone(rs.getString("PHONE"));
				cust.setCity(rs.getString("CITY"));
				cust.setAddress(rs.getString("ADDRESS"));
				cust.setPostalCode(rs.getString("POSTALCODE"));
				list.add(cust);
				
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<CustomerDTO> selectCustomers(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(CustomerDTO cus) {
		CustomerDTO cus1 = null;
		System.out.println(cus.getPassword()+"DAO비밀번호");
		try {
			String sql = "";
			
			if(cus.getPassword()==null) {
				sql = CustomerSQL.RETRIEVE.toString();
			}else {
				sql = CustomerSQL.CUSACCESS.toString();
			}
			System.out.println(cus.getPassword()+"DAO비밀번호트라이캐치안");
			
			PreparedStatement ps =	DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(sql);
			if(cus.getPassword()==null) {
				ps.setString(1, cus.getCustomerID());
			}else {
				ps.setString(1, cus.getCustomerID());
				ps.setString(2, cus.getPassword());
			}
			
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				cus1 = new CustomerDTO();
				cus1.setAddress(rs.getString("ADDRESS"));
				cus1.setPassword(rs.getString("PASSWORD"));
				cus1.setCustomerID(rs.getString("CUSTOMER_ID"));
				cus1.setCity(rs.getString("CITY"));
				cus1.setPostalCode(rs.getString("POSTALCODE"));
				cus1.setCustomerName(rs.getString("CUSTOMER_NAME"));
				cus1.setPhone(rs.getString("PHONE"));
				cus1.setSsn(rs.getString("SSN"));
				switch (cus1.getSsn().charAt(7)) {
				case '1': case'3':
					
					cus1.setGender("남");
					
					break;
				case '2': case'4':
					cus1.setGender("여");
					break;
				
				default:
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cus1;
	}

	@Override
	public String countCustomers(Proxy pxy) {
		String count = "";
		try {
			String sql = CustomerSQL.COUNT.toString();
		PreparedStatement ps = DatabaseFactory.createDatabase(Vendor.ORACLE)
								.getConnection()
								.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			count = rs.getString("COUNT");
		}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public CustomerDTO existCustomerID(CustomerDTO cus) {
		
		CustomerDTO cus1 = null;
		try {
			String sql = CustomerSQL.CUSACCESS.toString();
			
		PreparedStatement pstmt	= DatabaseFactory
								  .createDatabase(Vendor.ORACLE)
								  .getConnection()
								  .prepareStatement(sql);
		pstmt.setString(1, cus.getCustomerID());
		pstmt.setString(2, cus.getPassword());
		ResultSet rs = pstmt.executeQuery();
		System.out.println("rs:::"+ rs);
		while(rs.next()) {
			 cus1 = new CustomerDTO();
			cus1.setCustomerID(rs.getString("CUSTOMER_ID"));
			cus1.setPassword(rs.getString("PASSWORD"));
		}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cus1;
	}

	@Override
	public void updateCustomer(CustomerDTO customer) {
		CustomerDTO cus = null;
		try {
			String sql = CustomerSQL.UPDATE.toString();
		PreparedStatement ps = DatabaseFactory
							  .createDatabase(Vendor.ORACLE)
							  .getConnection()
							  .prepareStatement(sql);
		ps.setString(1, customer.getPassword());
		ps.setString(2, customer.getPhone());
		ps.setString(3, customer.getCity());
		ps.setString(4, customer.getAddress());
		ps.setString(5, customer.getPostalCode());
		ps.setString(6, customer.getCustomerID());
		ps.executeUpdate();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Map<String, Object> selectPhone(Proxy pxy) {
		Map<String, Object> map = new HashMap<String,Object>();
		
		try {
			String sql = CustomerSQL.PHONE.toString();
		PreparedStatement ps = DatabaseFactory
							  .createDatabase(Vendor.ORACLE)
							  .getConnection()
							  .prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		CustomerDTO cus = null;
		while(rs.next()) {
			cus = new CustomerDTO();
			String entry = rs.getString("CUSTOMER_ID");
			cus.setCustomerID(rs.getString("CUSTOMER_ID"));
			cus.setPhone(rs.getString("PHONE"));
			cus.setCustomerName(rs.getString("CUSTOMER_NAME"));
			map.put(entry, cus);
			
		}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
