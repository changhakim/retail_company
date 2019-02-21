package dao;

import java.util.List;

import domain.ProductDTO;
import proxy.Proxy;

public interface ProductDAO {

	public void createProduct(ProductDTO pro);
	public List<ProductDTO> selectProductList(Proxy pxy);
	public List<ProductDTO> selectProducts(ProductDTO pro);
	public ProductDTO selectProduct(ProductDTO pro);
	public int countProducts(Proxy pxy);
	public boolean existsProduct(ProductDTO pro);
	
	public void updateProduct(ProductDTO pro);
	public void deleteProduct(ProductDTO pro);
}
