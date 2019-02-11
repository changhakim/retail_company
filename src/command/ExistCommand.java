package command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command {

	public ExistCommand(HttpServletRequest request, HttpServletResponse response) {
		
		super(request, response);
		HttpSession session = request.getSession();
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			System.out.println("익지스트들어옴");
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existsEmployee(emp);
			if(exist) {
				System.out.println("접속성공");
				 
			List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList();
			
			request.setAttribute("list", list);
				
			}else {
				System.out.println("접속실패");
				super.setDomain("home");
				super.setPage("main");
				super.execute();
				
				
			}
			break;

		case CUSACCESS:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusID"));
			cus.setPassword(request.getParameter("password"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			
			if(!(cus==null)) {
				System.out.println("커스엑세스로그인성공");
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
