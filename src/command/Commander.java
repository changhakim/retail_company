package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Action;
import proxy.Proxy;
import proxy.RequestProxy;

public class Commander {
	
	public static Command order(Map<String, Proxy> pxy) {
		System.out.println("=======5========");
		
		Command cmd = null;
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		System.out.println(request.getParameter("cmd"));
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case MOVE:
			System.out.println("커멘더들어옴");
			cmd = new Command(pxy);
			break;
		case REGISTER : case CUSREGISTER : case PRODUCT_REGISTER:
			
			cmd = new CreateCommand(pxy);
			break;
		
		case ACCESS : case CUSACCESS :
			
			cmd = new ExistCommand(pxy);
			break;
		case CUST_LIST:case PRODUCT_LIST:
			cmd = new ListCommand(pxy);
		break;
		case CUST_RETRIEVE:case PRODUCT_RETRIEVE:
			cmd = new RetrieveCommand(pxy);
			break;
		case DETAIL_UPDATE:case PRODUCT_UPDATE:
			cmd = new UbdateCommand(pxy);
			break;
		case CUST_FILE_UPLOAD:
			cmd = new FileCommand(pxy);
			break;
		case CUST_DELETE:case PRODUCT_DELETE:
			System.out.println("커맨더 딜리트");
			cmd = new DeleteCommand(pxy);
			break;
		}
		
		System.out.println("커맨더 내부"+Receiver.cmd.getView());
		return cmd;
	}
}
