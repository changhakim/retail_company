package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class UbdateCommand extends Command {
	public UbdateCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		CustomerDTO cust = new CustomerDTO();
		String customerID = request.getParameter("customer_id");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String postalcode = request.getParameter("postal_code");
		cust.setCustomerID(customerID);
		cust = CustomerServiceImpl.getInstance().retrieveCustomer(cust);
		
		
		cust.setCustomerID(cust.getCustomerID());
		cust.setPhone((phone.equals(""))?cust.getPhone():phone);
		cust.setCity((city=="")?cust.getCity():city);
		cust.setAddress((address=="")?cust.getAddress():address);
		cust.setPostalCode((postalcode=="")?cust.getPostalCode():postalcode);
		cust.setPassword((password=="")?cust.getPassword():password);
		
		
		CustomerServiceImpl.getInstance().modifyCustomer(cust);
		System.out.println("비밀번호"+cust.getPassword());
		cust = CustomerServiceImpl.getInstance().retrieveCustomer(cust);
		request.setAttribute("cust", cust);
	}
}
