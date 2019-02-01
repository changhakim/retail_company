package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.EmployeeDTO;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{
	
	
	
	public CreateCommand(HttpServletRequest request, HttpServletResponse response) {
		
		super(request, response);
		
		
		EmployeeDTO emp = new EmployeeDTO();
		emp.setName(request.getParameter("name"));
		emp.setManager(request.getParameter("manager"));
		emp.setNotes(request.getParameter("notes"));
		emp.setPhoto(request.getParameter("photo"));
		emp.setBirthDate(request.getParameter("birthDate"));
		EmployeeServiceImpl.getInstance().registEmployee(emp);
}

	
	
}
