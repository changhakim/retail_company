package dao;

import java.util.List;

import domain.CustomerDTO;
import proxy.Pagination;

public interface CustomerDAO {
	public void insertCustomer(CustomerDTO customer);
	
	public List<CustomerDTO> selectCustomerList(Pagination page);
	public List<CustomerDTO> selectCustomers(String searchWord);
	public CustomerDTO selectCustomer(CustomerDTO cus);
	public String countCustomers();
	public CustomerDTO existCustomerID(CustomerDTO cus);
	
	
	public void updateCustomer(CustomerDTO customer);
	public void deleteCustomer(CustomerDTO customer);
}
