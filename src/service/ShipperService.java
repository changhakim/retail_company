package service;

import java.util.List;

import domain.ShipperDTO;

public interface ShipperService {

public void insertShipper(ShipperDTO shipper);
	
	public List<ShipperDTO> selectShipperList();
	public List<ShipperDTO> selectShippers(String searchWord);
	public ShipperDTO selectShipper(String searchWord);
	public int countShippers();
	public String existShipper(String searchWord);
	
	public void updateShipper(ShipperDTO shipper);
	public void deleteShipper(ShipperDTO shipper);
}
