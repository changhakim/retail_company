package command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import enums.Action;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;

public class FileCommand extends Command {

	public FileCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();
		
		System.out.println("파일커맨더들어옴");
		 /*java.lang.String saveDirectory, 
		  * int maxPostSize,
		  *  java.lang.String encoding, 
		  *  FileRenamePolicy policy*/
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_FILE_UPLOAD:
			
			ImageProxy ipxy = new ImageProxy();
			ipxy.carryOut(request);
			ipxy.getImg().getOwner();
			HashMap<String, Object> map = (HashMap<String, Object>) CustomerServiceImpl.getInstance().fileUpload(ipxy);
			
			request.setAttribute("image", map.get("cusimg"));
			request.setAttribute("cust", map.get("imcust"));
			
			break;
			
			

		default:
			break;
		}
	}

}
