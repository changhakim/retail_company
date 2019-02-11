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
		List<CustomerDTO> list = dao.selectCustomerList();
		return list;
	}

	@Override
	public List<CustomerDTO> retrieveCustomers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO retrieveCustomer(CustomerDTO cus) {
		
		CustomerDTO cus1 =  dao.selectCustomer(cus);
		return cus1;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existCustomerID(CustomerDTO cus) {
	CustomerDTO cus1 = dao.existCustomerID(cus);
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
