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
		execute();
	}
	
	@Override
	public void execute() {
		
		this.setAction(request.getParameter("cmd"));
		this.setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		this.setPage(request.getParameter("page"));
		
		this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
		System.out.println(view+"보여줘뷰");
	}
	
	
	
}
