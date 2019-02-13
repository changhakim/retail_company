package service;

import java.util.List;

import domain.CustomerDTO;
import proxy.Pagination;
import proxy.Proxy;

public interface CustomerService {

	
	public void registCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> bringCustomerList(Proxy pxy);
	public List<CustomerDTO> retrieveCustomers(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public String countCustomers(Proxy pxy);
	public boolean existCustomerID(CustomerDTO cus);
	
	
	public void modifyCustomer(CustomerDTO customer);
	public void removeCustomer(CustomerDTO customer);
}
