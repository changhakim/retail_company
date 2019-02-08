package service;

import java.util.List;

import domain.CustomerDTO;

public interface CustomerService {

	
	public void registCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> bringCustomerList();
	public List<CustomerDTO> retrieveCustomers(String searchWord);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	
	
	public void modifyCustomer(CustomerDTO customer);
	public void removeCustomer(CustomerDTO customer);
}
