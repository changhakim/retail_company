package service;

import java.util.List;

import dao.ProductDAOImpl;
import domain.ProductDTO;
import proxy.Proxy;

public class ProductServiceImpl implements ProductService{
	private static ProductServiceImpl instance = new ProductServiceImpl();
	private ProductServiceImpl() {
		dao = ProductDAOImpl.getInstance();
	}
	public static ProductServiceImpl getInstance() {return instance;}

	ProductDAOImpl dao;
	
	
	
	@Override
	public void registProduct(ProductDTO pro) {
		dao.createProduct(pro);
		
	}
	@Override
	public List<ProductDTO> bringProductList(Proxy pxy) {
		
		return dao.selectProductList(pxy);
	}

	@Override
	public List<ProductDTO> retrieveProducts(ProductDTO pro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO retrieveProduct(ProductDTO pro) {
		
		return dao.selectProduct(pro);
	}

	@Override
	public int countProducts(Proxy pxy) {
		
		return dao.countProducts(pxy);
	}

	@Override
	public boolean existsProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(ProductDTO pro) {
		dao.deleteProduct(pro);
		
	}

}
