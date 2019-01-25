package service;

import java.util.List;

import domain.OrderDetailDTO;



public interface OrderDetailService {
	
	public void registOrderDetail(OrderDetailDTO orderDetail);
	
	public List<OrderDetailDTO> bringOrderDetailList();
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord);
	public OrderDetailDTO retrieveOrderDetail(String searchWord);
	public int countOrderDetails();
	public boolean existOrderDetails(String searchWord);
	
	public void modifyOrderDetail(OrderDetailDTO orderDetail);
	public void removeOrderDetail(OrderDetailDTO orderDetail);
}
