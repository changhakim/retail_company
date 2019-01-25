package service;

import java.util.List;

import dao.OrderDetailDAO;
import dao.OrderDetailDAOImpl;
import domain.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService{
	private static OrderDetailService instance = new OrderDetailServiceImpl();
	private OrderDetailServiceImpl() {
		dao = OrderDetailDAOImpl.getInstance();
	}
	public static OrderDetailService getInstance() {return instance;}
	OrderDetailDAO dao;

	public static void setInstance(OrderDetailService instance) {
		OrderDetailServiceImpl.instance = instance;
	}


	@Override
	public void registOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> bringOrderDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countOrderDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existOrderDetails(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

}
