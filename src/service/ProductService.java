package service;

import java.util.List;

import domain.EmployeeDTO;
import domain.ProductDTO;
import proxy.Proxy;

public interface ProductService {

	public void registProduct(ProductDTO pro);
	public List<ProductDTO> bringProductList(Proxy pxy);
	public List<ProductDTO> retrieveProducts(ProductDTO pro);
	public ProductDTO retrieveProduct(ProductDTO pro);
	public int countProducts(Proxy pxy);
	public boolean existsProduct(ProductDTO pro);
	
	public void modifyProduct(ProductDTO pro);
	public void removeProduct(ProductDTO pro);
}
