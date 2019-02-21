package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

public class UbdateCommand extends Command {
	public UbdateCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case DETAIL_UPDATE:
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
			break;
		case PRODUCT_UPDATE:
			ProductDTO pro = new ProductDTO();
			pro.setProductID(request.getParameter("product_id"));
			pro = ProductServiceImpl.getInstance().retrieveProduct(pro);
			pro.setProductID(pro.getProductID());
			pro.setProductName((request.getParameter("product_name")==null)?pro.getProductName():request.getParameter("product_name"));
			pro.setUnit((request.getParameter("unit")==null)?pro.getUnit():request.getParameter("unit"));
			pro.setPrice((request.getParameter("price")==null)?pro.getPrice():request.getParameter("price"));
			ProductServiceImpl.getInstance().modifyProduct(pro);
			
			pro = ProductServiceImpl.getInstance().retrieveProduct(pro);
			request.setAttribute("pro", pro);
			break;
		default:
			break;
		}
		
	}
}
