package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import enums.Action;
import proxy.Proxy;
import service.CustomerServiceImpl;

public class ListCommand extends Command {
public ListCommand(HttpServletRequest request, HttpServletResponse response) {
	super(request, response);
	
	
	switch(Action.valueOf(request.getParameter("cmd").toUpperCase())) {
	case CUST_LIST:
		List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList(new Proxy().getPage());
		request.setAttribute("list", list);
		
		break;
		
		default:
		break;
	}


}

}
