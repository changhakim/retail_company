package dao;

import java.util.List;

import domain.OrderDetailDTO;

public interface OrderDetailDAO {

	public void insertOrderDetail(OrderDetailDTO orderDetail);
	
	public List<OrderDetailDTO> selectOrderDetailList();
	public List<OrderDetailDTO> selectOrderDetails(String searchWord);
	public OrderDetailDTO selectOrderDetail(String searchWord);
	public int countOrderDetails();
	public boolean existOrderDetails(String searchWord);
	
	public void updateOrderDetail(OrderDetailDTO orderDetail);
	public void deleteOrderDetail(OrderDetailDTO orderDetail);
}
