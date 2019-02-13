package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
import proxy.Proxy;
import proxy.RequestProxy;
@Data
public class Command implements Order{

	protected HttpServletRequest request;
	protected String action,view,domain,page;
	public Command() {}
	public Command(Map<String,Proxy> pxy)  {
		System.out.println("=====6.command=====");
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		

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
