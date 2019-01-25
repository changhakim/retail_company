package service;

import java.util.List;

import domain.SupplierDTO;

public class SupplierServiceImpl implements SupplierService {
	private static SupplierService instance = new SupplierServiceImpl();
	private SupplierServiceImpl() {
		dao = SupplierServiceImpl.getInstance();
	}
	public static SupplierService getInstance() {return instance;}

	SupplierService dao;
	
	public static void setInstance(SupplierService instance) {
		SupplierServiceImpl.instance = instance;
	}

	@Override
	public void registSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplierDTO> bringSupplierlist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SupplierDTO> retrieveSuppliers(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SupplierDTO retrieveSupplier(String searchWord) {
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
	public void modifySupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSupplier(SupplierDTO supplier) {
		// TODO Auto-generated method stub
		
	}

}
