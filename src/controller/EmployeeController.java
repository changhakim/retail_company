package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.EmployeeService;
import service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/employee.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeService service = EmployeeServiceImpl.getInstance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("사번:"+request.getParameter("employeeID"));
		System.out.println("이름:"+request.getParameter("name"));
		System.out.println("매니져:"+request.getParameter("manager"));
		System.out.println("생일:"+request.getParameter("birthDate"));
		System.out.println("사번:"+request.getParameter("notes"));
		request.getRequestDispatcher("/WEB-INF/view/employee/main.jsp").forward(request, response);
		
	}

	

}
