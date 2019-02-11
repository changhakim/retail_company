package command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.CustomerDTO;
import service.CustomerServiceImpl;

public class listCommand extends Command {
public listCommand(HttpServletRequest request, HttpServletResponse response) {
	super(request, response);
	List<CustomerDTO> list = new ArrayList<>();
	list = CustomerServiceImpl.getInstance().bringCustomerList();
}
}
