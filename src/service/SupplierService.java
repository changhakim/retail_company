package service;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierService {
	public void registSupplier(SupplierDTO supplier);
	public List<SupplierDTO> bringSupplierlist();
	public List<SupplierDTO> retrieveSuppliers(String searchWord);
	public SupplierDTO retrieveSupplier(String searchWord);
	public int countSuppliers();
	public boolean existSupplier(String searchWord);
	public void modifySupplier(SupplierDTO supplier);
	public void removeSupplier(SupplierDTO supplier);
}
