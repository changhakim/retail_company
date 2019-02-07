package service;

import java.util.List;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;
import domain.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{

	private static CustomerService instance = new CustomerServiceImpl();
	public CustomerServiceImpl() {
		dao = CustomerDAOImpl.getInstance();
	}
	public static CustomerService getInstance() {return instance;}
	
	CustomerDAO dao;


	@Override
	public void registCustomer(CustomerDTO customer) {
		dao.insertCustomer(customer);
		
	}

	@Override
	public List<CustomerDTO> bringCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDTO> retrieveCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO retrieveCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existCustomer(CustomerDTO cus) {
	CustomerDTO cus1 = dao.existCustomer(cus);
		System.out.println("로그인들어옴");
		boolean ok = true;
		if(cus1 == null) {
			ok = false;
		}
		return ok;
	}

	@Override
	public void modifyCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
	}

}
