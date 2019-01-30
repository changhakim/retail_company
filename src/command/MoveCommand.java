package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MoveCommand extends Command {
	public MoveCommand(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("=======4.무브커맨더진입=======");
		setRequest(request);
		setAction(request.getParameter("cmd"));
		setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		execute();
	}
}
