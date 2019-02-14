package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import proxy.Pagination;
import proxy.Proxy;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> selectCustomerList(Proxy pxy);
	public List<CustomerDTO> selectCustomers(Proxy pxy);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public String countCustomers(Proxy pxy);
	public CustomerDTO existCustomerID(CustomerDTO cus);
	
	
	public void updateCustomer(CustomerDTO customer);
	public void deleteCustomer(CustomerDTO customer);

	public Map<String, Object> selectPhone(Proxy pxy);
}
