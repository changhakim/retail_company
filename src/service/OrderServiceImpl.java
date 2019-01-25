package service;

import java.util.List;

import dao.OrderDAO;
import dao.OrderDAOImpl;
import domain.OrderDTO;

public class OrderServiceImpl implements OrderService {
	private static OrderService instance = new OrderServiceImpl();
	private OrderServiceImpl() {
		dao = OrderDAOImpl.getInstance();
	}
	public static OrderService getInstance() {return instance;}
	
	OrderDAO dao;


	@Override
	public void registOrders(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> bringOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDTO> retrieveOrders(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDTO retrieveOrder(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrders() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existOrders(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(OrderDTO order) {
		// TODO Auto-generated method stub
		
	}

}
