package dao;

import java.util.List;

import domain.OrderDetailDTO;

public class OrderDetailDAOImpl implements OrderDetailDAO{
	private static OrderDetailDAO instance = new OrderDetailDAOImpl();
	private OrderDetailDAOImpl() {}
	public static OrderDetailDAO getInstance() {return instance;}

	@Override
	public void insertOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> selectOrderDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetailDTO> selectOrderDetails(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetailDTO selectOrderDetail(String searchWord) {
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
	public void updateOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderDetail(OrderDetailDTO orderDetail) {
		// TODO Auto-generated method stub
		
	}

}
