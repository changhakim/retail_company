package service;

import java.util.List;

import domain.CustomerDTO;
import proxy.Pagination;

public interface CustomerService {

	
	public void registCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> bringCustomerList(Pagination page);
	public List<CustomerDTO> retrieveCustomers();
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public String countCustomers();
	public boolean existCustomerID(CustomerDTO cus);
	
	
	public void modifyCustomer(CustomerDTO customer);
	public void removeCustomer(CustomerDTO customer);
}
