package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import domain.EmployeeDTO;


@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		session.setAttribute("ctx", request.getContextPath());	
		session.setAttribute("css", session.getAttribute("ctx")+"/resources/css/");
		session.setAttribute("js", session.getAttribute("ctx")+"/resources/js/");
		session.setAttribute("img", session.getAttribute("ctx")+"/resources/img/");
		EmployeeDTO e = (EmployeeDTO)session.getAttribute("admins");
		if(e==null) {
			
			request.setAttribute("compo", "pre");
		}else {
			
			request.setAttribute("compo", "post");
		}
	
		
		
		
		
		
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/home/main.jsp");
			rd.forward(request, response);
			
			
			/*String page =request.getParameter("page");
				
			int a = request.getServletPath().indexOf(".");
			String dest = request.getServletPath().substring(1, a);*/
			
			
	}

}
