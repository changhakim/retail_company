package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.ImageDTO;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;

public class RetrieveCommand extends Command{

	public RetrieveCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();

		
		
		CustomerDTO cus = new CustomerDTO();
		ImageDTO img = new ImageDTO();
		
		cus.setCustomerID(request.getParameter("customer_id"));
		cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
		request.setAttribute("cust", cus);
		request.setAttribute("img", img);
	}
}
