package dao;

import java.util.List;

import domain.OrderDTO;

public interface OrderDAO {


	public void insertOrders(OrderDTO order);
	
	public List<OrderDTO> selectOrderList();
	public List<OrderDTO> selectOrders(String searchWord);
	public OrderDTO selectOrder(String searchWord);
	public int selectOrders();
	public String existOrders(String searchWord);
	
	public void updateOrder(OrderDTO order);
	public void deleteOrder(OrderDTO order);
}
