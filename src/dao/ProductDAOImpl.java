package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.ProductDTO;
import enums.ProductSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class ProductDAOImpl implements ProductDAO{
	private static ProductDAOImpl instance = new ProductDAOImpl();
	Connection conn;
	private ProductDAOImpl() {
	conn =	DatabaseFactory
			.createDatabase(Vendor.ORACLE)
			.getConnection();
	}
	public static ProductDAOImpl getInstance() {return instance;}


	
	@Override
	public void createProduct(ProductDTO pro) {
		try {
			System.out.println("프로덕트 크리에이트들어옴");
			System.out.println("pro.getCategoryID()"+pro.getCategoryID());
			String sql = ProductSQL.REGISTER.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,pro.getProductName());
			ps.setString(2,pro.getSupplierID());
			ps.setString(3,pro.getCategoryID());
			ps.setString(4,pro.getUnit());
			ps.setString(5,pro.getPrice());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public List<ProductDTO> selectProductList(Proxy pxy) {
		List<ProductDTO> list = new ArrayList<>();
		try {
			String sql = ProductSQL.LIST.toString();
			Pagination page = ((PageProxy)pxy).getPage();
			PreparedStatement ps = DatabaseFactory
								   .createDatabase(Vendor.ORACLE)
								   .getConnection()
								   .prepareStatement(sql);
			
			ps.setInt(1, page.getStartRow());
			ps.setInt(2, page.getEndRow());
		
		ResultSet rs =	ps.executeQuery();
		ProductDTO pro = null;
		while(rs.next()) {
			pro = new ProductDTO();
			pro.setCategoryID(rs.getString("CATEGORY_ID"));
			pro.setProductID(rs.getString("PRODUCT_ID"));
			pro.setProductName(rs.getString("PRODUCT_NAME"));
			pro.setSupplierID(rs.getString("SUPPLIER_ID"));
			pro.setUnit(rs.getString("UNIT"));
			pro.setPrice(rs.getString("PRICE"));
			list.add(pro);
		}
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ProductDTO> selectProducts(ProductDTO pro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO selectProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countProducts(Proxy pxy) {
		int a = 0;
		try {
			String sql = ProductSQL.COUNT.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				 a = rs.getInt("TOTAL");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public boolean existsProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(ProductDTO pro) {
		try {
			String sql = ProductSQL.DELETE.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, pro.getProductID());
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
