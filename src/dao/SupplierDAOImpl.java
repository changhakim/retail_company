package dao;

import java.util.List;

import domain.SupplierDTO;

public class SupplierDAOImpl implements SupplierDAO{

	private static  SupplierDAO instance = new SupplierDAOImpl();
	private SupplierDAOImpl() {}
	public static SupplierDAO getInstance() {return instance;}



	@Override
	public void insertSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplierDTO> selectSupplierlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplierDTO> selectSuppliers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO selectSupplier(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countSuppliers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existSupplier(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}
	
}
