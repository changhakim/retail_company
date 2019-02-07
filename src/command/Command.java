package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.Data;
@Data
public class Command implements Order{

	protected HttpServletRequest request;
	protected String action,view,domain,page;
	public Command() {}
	public Command(HttpServletRequest request, HttpServletResponse response) {
		setRequest(request);

		this.setAction(request.getParameter("cmd"));
		String dir = request.getParameter("dir");
		if(dir==null) {
			setDomain(request.getServletPath().substring(1, request.getServletPath().indexOf(".")));
		}else {
			setDomain(dir);
		}
		this.setPage(request.getParameter("page"));
		
		execute();
	}
	
	@Override
	public void execute() {
		
		this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
		
	}
	
	
	
}
