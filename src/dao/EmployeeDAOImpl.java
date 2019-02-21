package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vendor;
import factory.DatabaseFactory;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static EmployeeDAO instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {}
	public static EmployeeDAO getInstance() {return instance;}
	
	

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {
			
			String sql = String.format(EmployeeSQL.REGISTER.toString());
			System.out.println("실행할 쿼리:"+sql);
	Connection conn = DatabaseFactory
					  .createDatabase(Vendor.ORACLE)
					  .getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getManager());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getBirthDate());
			pstmt.setString(4, emp.getNotes());
			int rs = pstmt.executeUpdate();
			System.out.println(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		List<EmployeeDTO> list = null;
		try {
			String sql = "";
		PreparedStatement pstmt =	DatabaseFactory
									.createDatabase(Vendor.ORACLE)
									.getConnection()
									.prepareStatement(sql);
			pstmt.setString(1, null);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				list.add(null);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		List<EmployeeDTO> list = null;
		try {
			String sql = "";
		PreparedStatement pstmt =   DatabaseFactory
									.createDatabase(Vendor.ORACLE)
									.getConnection()
									.prepareStatement(sql);
									pstmt.setString(1, null);
									ResultSet rs = pstmt.executeQuery();
									while(rs.next()) {
									list.add(null);
									}
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		EmployeeDTO emp = null;
		try {
			String sql = "";
		PreparedStatement pstmt = 	DatabaseFactory
									.createDatabase(Vendor.ORACLE)
									.getConnection()
									.prepareStatement(sql);
						 pstmt.setString(1, null);
						 ResultSet rs = pstmt.executeQuery();
						 while(rs.next()) {
							 
						 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeDTO existsEmployee(EmployeeDTO emp) {
		EmployeeDTO emp1 = null;
		
		try {
			String sql = String.format(EmployeeSQL.ACCESS.toString());
			PreparedStatement pstmt =	DatabaseFactory.
										createDatabase(Vendor.ORACLE).
										getConnection().
										prepareStatement(sql);
					pstmt.setString(1, emp.getEmployeeID());
					pstmt.setString(2, emp.getName());
					ResultSet rs = pstmt.executeQuery();
					System.out.println("다오아이디"+emp.getEmployeeID());
					while(rs.next()){
						emp1 = new EmployeeDTO();
						emp1.setEmployeeID(rs.getString("EMPLOYEE_ID"));
						emp1.setName(rs.getString("NAME"));
					}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp1;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
