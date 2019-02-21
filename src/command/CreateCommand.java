package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import domain.ProductDTO;
import enums.Action;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;
import proxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;
import service.ProductServiceImpl;

public class CreateCommand extends Command{
	
	
	
	public CreateCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = null;
		Proxy pagePxy = null;
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER:
			System.out.println("레지스터들어옴");
			EmployeeDTO emp = new EmployeeDTO();
			emp.setName(request.getParameter("name"));
			emp.setManager(request.getParameter("manager"));
			emp.setNotes(request.getParameter("notes"));
			emp.setPhoto(request.getParameter("photo"));
			emp.setBirthDate(request.getParameter("birthDate"));
			EmployeeServiceImpl.getInstance().registEmployee(emp);
			break;

		case CUSREGISTER:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerID(request.getParameter("cusID"));
			cus.setCustomerName(request.getParameter("cusname"));
			cus.setPassword(request.getParameter("password"));
			cus.setPhone(request.getParameter("phone"));
			cus.setAddress(request.getParameter("address"));
			cus.setCity(request.getParameter("city"));
			cus.setPostalCode(request.getParameter("postalcode"));
			cus.setSsn(request.getParameter("ssn"));
			CustomerServiceImpl.getInstance().registCustomer(cus);
			break;
		case PRODUCT_REGISTER:
			ProductDTO pro = new ProductDTO();
			pro.setCategoryID(request.getParameter("category_id"));
			pro.setPrice(request.getParameter("price"));
			pro.setProductID(request.getParameter("product_id"));
			pro.setProductName(request.getParameter("product_name"));
			pro.setSupplierID(request.getParameter("supplier_id"));
			pro.setUnit(request.getParameter("unit"));
			System.out.println("프로덕트레지스터 더들오옴");
			ProductServiceImpl.getInstance().registProduct(pro);
			
			paging = new Pagination();
			paging.carryOut(request);
			pagePxy = new PageProxy();
			pagePxy.carryOut(paging);
			List<ProductDTO> list1 = ProductServiceImpl.getInstance().bringProductList(pagePxy);
			request.setAttribute("list", list1);
			request.setAttribute("pagination", paging);
			break;
		default:
			break;
		}
		
}

	
	
}
