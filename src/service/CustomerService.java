package service;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerService {

	
	public void registCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> bringCustomerList();
	public List<CustomerDTO> retrieveCustomers(String searchWord);
	public CustomerDTO retrieveCustomer(String searchWord);
	public int countCustomers();
	public boolean existCustomer(String serachWord);
	
	
	public void modifyCustomer(CustomerDTO customer);
	public void removeCustomer(CustomerDTO customer);
}
