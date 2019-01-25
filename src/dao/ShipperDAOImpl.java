package dao;

import java.util.List;

import domain.ShipperDTO;

public class ShipperDAOImpl implements ShipperDAO{
	private static ShipperDAO instance = new ShipperDAOImpl();
	private ShipperDAOImpl() {}
	public static ShipperDAO getInstance() {return instance;}

	@Override
	public void registShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShipperDTO> bringShipperList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShipperDTO> retrieveShippers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShipperDTO retrieveShipper(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countShippers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String existShipper(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}
	
}
