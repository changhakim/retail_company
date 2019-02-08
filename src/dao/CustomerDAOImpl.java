package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import domain.CustomerDTO;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;

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
							pstmt.setString(4, customer.getAddress());
							pstmt.setString(5, customer.getCity());
							pstmt.setString(6, customer.getPostalCode());
							pstmt.setString(7, customer.getSsn());
				pstmt.executeUpdate();	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<CustomerDTO> selectCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> selectCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO selectCustomer(CustomerDTO cus) {
		CustomerDTO cus1 = null;
		try {
			
			PreparedStatement ps =	DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection()
			.prepareStatement(CustomerSQL.CUSACCESS.toString());
			ps.setString(1, cus.getCustomerID());
			ps.setString(2, cus.getPassword());
			ResultSet rs =  ps.executeQuery();
			while(rs.next()) {
				cus1 = new CustomerDTO();
				cus1.setAddress(rs.getString("ADDRESS"));
				cus1.setCustomerID(rs.getString("CUSTOMER_ID"));
				cus1.setCity(rs.getString("CITY"));
				cus1.setSsn(rs.getString("SSN"));
				cus1.setCustomerName(rs.getString("CUSTOMER_NAME"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cus1;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

}
