package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ProductServiceImpl;

public class ListCommand extends Command {
public ListCommand(Map<String, Proxy> pxy) {
	super(pxy);
	RequestProxy req = (RequestProxy)pxy.get("req");
	HttpServletRequest request = req.getRequest();
	Proxy paging = null;
	Proxy pagePxy = null;
	
	
	switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
	case CUST_LIST:
		paging = new Pagination();
		paging.carryOut(request);
		pagePxy = new PageProxy();
		pagePxy.carryOut(paging);
		List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList(pagePxy);
		request.setAttribute("list", list);
		request.setAttribute("pagination", paging);
		
		break;
	case PRODUCT_LIST:
		paging = new Pagination();
		paging.carryOut(request);
		pagePxy = new PageProxy();
		pagePxy.carryOut(paging);
		List<ProductDTO> list1 = ProductServiceImpl.getInstance().bringProductList(pagePxy);
		request.setAttribute("list", list1);
		request.setAttribute("pagination", paging);
		
		default:
		break;
	}


}

}
