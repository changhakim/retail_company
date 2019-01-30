package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.CustomerService;
import service.CustomerServiceImpl;


@WebServlet("/customer.do")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   CustomerService service = CustomerServiceImpl.getInstance();
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		String cmd = request.getParameter("cmd");
		int a = request.getServletPath().indexOf(".");
		String dir = request.getServletPath().substring(1,a);
		
		switch(cmd) {
		case "move":
		request.getRequestDispatcher("/WEB-INF/view/"+dir+"/"+page+".jsp").forward(request, response);
		break;
		}
		}

	
}
