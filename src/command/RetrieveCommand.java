package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.ImageDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.ImageProxy;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;
import service.ProductServiceImpl;

public class RetrieveCommand extends Command{

	public RetrieveCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy) pxy.get("req");
		HttpServletRequest request = req.getRequest();

		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_RETRIEVE:
			System.out.println("리트리버커맨드들어옴");
			System.out.println("커스토머아이디 리트리버"+request.getParameter("customer_id"));
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("customer_id"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			ImageDTO img = new ImageDTO();
			System.out.println("디폴트포토"+cus.getPhoto());
			img.setImgSeq(cus.getPhoto());
			img = ImageServiceImpl.getInstance().retrieveImage(img);
			System.out.println(img.getImgName()+"리트리버커맨드 이미지이름");
			request.setAttribute("cust", cus);
			request.setAttribute("image", img);
			break;
		case PRODUCT_RETRIEVE:
			ProductDTO pro = new ProductDTO();
			pro.setProductID(request.getParameter("product_id"));
			ProductServiceImpl.getInstance().retrieveProduct(pro);
		
		default:
			break;
		}

	}
}
