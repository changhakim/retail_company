package dao;

import java.util.List;

import domain.ShipperDTO;

public interface ShipperDAO {
	
	public void registShipper(ShipperDTO shipper);
	
	public List<ShipperDTO> bringShipperList();
	public List<ShipperDTO> retrieveShippers(String searchWord);
	public ShipperDTO retrieveShipper(String searchWord);
	public int countShippers();
	public String existShipper(String searchWord);
	
	public void modifyShipper(ShipperDTO shipper);
	public void removeShipper(ShipperDTO shipper);
}
