package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import proxy.PageProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command {

	public ExistCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		HttpSession session = request.getSession();
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			System.out.println("======6=====");
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existsEmployee(emp);
			if(exist) {
			System.out.println("===사원로그인성공==");
			Proxy paging = new Pagination();
			paging.carryOut(request);
			Proxy pagePxy = new PageProxy();
			pagePxy.carryOut(paging);
			List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList(pagePxy);
			
			request.setAttribute("list", list);
			request.setAttribute("pagination", paging);
				
			}else {
				
				super.setDomain("home");
				super.setPage("main");
				super.execute();
				
				
			}
			super.setRequest(request);
			System.out.println("익짓페이지"+super.getPage());
			break;

		case CUSACCESS:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusID"));
			cus.setPassword(request.getParameter("password"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			
			if(!(cus==null)) {
				
				session.setAttribute("customer", cus);
			}else {
				super.setDomain("customer");
				super.setPage("signin");
				super.execute();
			}
			
			break;
		default:
			break;
		}
		
		
	}
}
