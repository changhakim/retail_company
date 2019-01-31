package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandMove extends Command {

	public CommandMove(HttpServletRequest request, HttpServletResponse response) {
	setRequest(request);
	setAction(request.getParameter("cmd"));
	setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
	setPage(request.getParameter("page"));
	execute();
	
}
	
	
}
