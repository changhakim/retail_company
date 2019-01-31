package command;

import javax.servlet.http.HttpServletRequest;

import lombok.Data;
@Data
public class Command implements Order{

	protected HttpServletRequest request;
	protected String action,view,domain,page;
	@Override
	public void execute() {
		this.view = "/WEB-INF/view/"+domain+"/"+page+".jsp";
		
	}
	
	
	
}
