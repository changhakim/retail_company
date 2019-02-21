package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import domain.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService{
	private static EmployeeService instance = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {
		dao = EmployeeDAOImpl.getInstance();
	}
	public static EmployeeService getInstance() {return instance;}

	EmployeeDAO dao;




	@Override
	public void registEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
		
	}

	@Override
	public List<EmployeeDTO> bringEmployeeList() {
		
		return dao.selectEmployeeList();
	}

	@Override
	public List<EmployeeDTO> retrieveEmployees(String searchWord) {
		
		return dao.selectEmployees(searchWord);
	}

	@Override
	public EmployeeDTO retrieveEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectEmployee(searchWord);
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsEmployee(EmployeeDTO emp) {
	EmployeeDTO emp1 = dao.existsEmployee(emp);
	
	
	boolean exist = true;
	if(emp1==null) {
		exist = false;
		
	}
		return exist;
	}

	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		dao.updateEmployee(emp);
		
	}

	@Override
	public void removeEmployee(EmployeeDTO emp) {
		dao.deleteEmployee(emp);
		
	}

}
