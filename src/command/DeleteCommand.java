package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;
import service.ProductServiceImpl;

public class DeleteCommand extends Command{

	public DeleteCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = null;
		Proxy pagePxy = null;
		
		switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_DELETE:
			CustomerDTO cust = new CustomerDTO();
			cust.setCustomerID(request.getParameter("customer_id"));
			CustomerServiceImpl.getInstance().removeCustomer(cust);
		break;
		case PRODUCT_DELETE :
			
			System.out.println("requstgetparamiter"+request.getParameter("product_id"));
			ProductDTO pro = new ProductDTO();
			pro.setProductID(request.getParameter("product_id"));
			ProductServiceImpl.getInstance().removeProduct(pro);
			
			paging = new Pagination();
			paging.carryOut(request);
			pagePxy = new PageProxy();
			pagePxy.carryOut(paging);
			List<ProductDTO> list1 = ProductServiceImpl.getInstance().bringProductList(pagePxy);
			request.setAttribute("list", list1);
			request.setAttribute("pagination", paging);
		break;
		default:
			break;
		
		}
		
	}
}
