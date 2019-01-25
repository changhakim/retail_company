package dao;

import java.util.List;

import domain.CustomerDTO;

public class CustomerDAOImpl  implements CustomerDAO{

	private static CustomerDAO instance = new CustomerDAOImpl();
	private CustomerDAOImpl() {}
	public static CustomerDAO getInstance() {return instance;}


	@Override
	public void insertCustomer(CustomerDTO customer) {
		// TODO Auto-generated method stub
		
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
	public CustomerDTO selectCustomer(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existCustomer(String serachWord) {
		// TODO Auto-generated method stub
		return null;
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
