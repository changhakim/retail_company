package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Action;

public class commander {
	
	public static Command order(HttpServletRequest request, HttpServletResponse response) {
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case MOVE:
			System.out.println("커멘더들어옴");
			cmd = new CommandMove(request, response);
			break;
		case REGISTER:
			cmd = new CommandMove(request, response);
			break;

		default:
			break;
		}
		return cmd;
	}
}