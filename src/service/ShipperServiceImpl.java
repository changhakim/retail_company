package service;

import java.util.List;

import dao.ShipperDAO;
import dao.ShipperDAOImpl;
import domain.ShipperDTO;

public class ShipperServiceImpl implements ShipperService{
	private static ShipperService instance = new ShipperServiceImpl();
	private ShipperServiceImpl() {
		dao = ShipperDAOImpl.getInstance();
	}
	public static ShipperService getInstance() {return instance;}
	
	ShipperDAO dao;




	
	@Override
	public void insertShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShipperDTO> selectShipperList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShipperDTO> selectShippers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShipperDTO selectShipper(String searchWord) {
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
	public void updateShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteShipper(ShipperDTO shipper) {
		// TODO Auto-generated method stub
		
	}

	
}
