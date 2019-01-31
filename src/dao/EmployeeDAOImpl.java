package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
			
			String sql = String.format(EmployeeSQL.REGISTER.toString(),emp.getManager(),emp.getName()
					,emp.getBirthDate(),emp.getPhoto(),emp.getNotes());
			System.out.println("실행할 쿼리:"+sql);
	Connection conn = DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getManager());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getBirthDate());
			pstmt.setString(4, emp.getPhoto());
			pstmt.setString(5, emp.getNotes());
			int rs = pstmt.executeUpdate();
			System.out.println(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existsEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
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
