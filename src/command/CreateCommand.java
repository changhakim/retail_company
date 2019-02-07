package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	
	
	public CreateCommand(HttpServletRequest request, HttpServletResponse response) {
		
		super(request, response);
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setName(request.getParameter("name"));
			emp.setManager(request.getParameter("manager"));
			emp.setNotes(request.getParameter("notes"));
			emp.setPhoto(request.getParameter("photo"));
			emp.setBirthDate(request.getParameter("birthDate"));
			EmployeeServiceImpl.getInstance().registEmployee(emp);
			break;

		case CUSREGISTER:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusID"));
			cus.setCustomerName(request.getParameter("cusname"));
			cus.setPassword(request.getParameter("password"));
			cus.setAddress(request.getParameter("address"));
			cus.setCity(request.getParameter("city"));
			cus.setPostalCode(request.getParameter("postalcode"));
			cus.setSsn(request.getParameter("ssn"));
			CustomerServiceImpl.getInstance().registCustomer(cus);
			break;
		default:
			break;
		}
		
}

	
	
}
