package dao;

import java.util.List;

import domain.EmployeeDTO;

public interface EmployeeDAO {
	public void insertEmployee(EmployeeDTO emp);
	
	public List<EmployeeDTO> selectEmployeeList();
	public List<EmployeeDTO> selectEmployees(String searchWord);
	public EmployeeDTO selectEmployee(String searchWord);
	public int countEmployees();
	public EmployeeDTO existsEmployee(EmployeeDTO emp);
	
	public void updateEmployee(EmployeeDTO emp);
	public void deleteEmployee(EmployeeDTO emp);
	
}
