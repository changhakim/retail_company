package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Action;

public class Commander {
	
	public static Command order(HttpServletRequest request, HttpServletResponse response) {
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case MOVE:
			System.out.println("커멘더들어옴");
			cmd = new Command(request,response);
			break;
		case REGISTER : case CUSREGISTER :
			cmd = new CreateCommand(request, response);
			break;
		
		case ACCESS : case CUSACCESS :
			System.out.println("커맨더ACCESS들어옴");
			cmd = new ExistCommand(request, response);
			break;
		case CUST_LIST:
			cmd = new ListCommand(request, response);
		}
		System.out.println("커맨더 내부"+Receiver.cmd.getView());
		return cmd;
	}
}
