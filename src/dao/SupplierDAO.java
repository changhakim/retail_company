package dao;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierDAO {
	public void insertSupplier(SupplierDTO supplier);
	public List<SupplierDTO> selectSupplierlist();
	public List<SupplierDTO> selectSuppliers(String searchWord);
	public SupplierDTO selectSupplier(String searchWord);
	public int countSuppliers();
	public boolean existSupplier(String searchWord);
	public void updateSupplier(SupplierDTO supplier);
	public void deleteSupplier(SupplierDTO supplier);
}
