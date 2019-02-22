package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CategoryDTO;
import domain.CustomerDTO;
import enums.CategorySQL;
import enums.CustomerSQL;
import enums.Vendor;
import factory.DatabaseFactory;
import proxy.PageProxy;
import proxy.Pagination;
import proxy.Proxy;

public class CategoryDAOImpl implements CategoryDAO {
	private static CategoryDAOImpl instance = new CategoryDAOImpl();
	Connection conn;
	private CategoryDAOImpl() {
		conn = DatabaseFactory
				.createDatabase(Vendor.ORACLE)
				.getConnection();
	}
	public static CategoryDAOImpl getInstance() {return instance;}


	@Override
	public void createCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> seletCategoryList(Proxy pxy) {
		System.out.println("카테고리리스트 들어옴");
		List<CategoryDTO> list = new ArrayList<>();
		try {
			String sql = CategorySQL.LIST.toString();
			Pagination page = ((PageProxy)pxy).getPage();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, page.getStartRow());
			ps.setInt(2, page.getEndRow());
		
			ResultSet rs =	ps.executeQuery();
		
			CategoryDTO cate = null;
			while(rs.next()) {
			cate = new CategoryDTO();
			cate.setCategoryID(rs.getString("CATEGORY_ID"));
			cate.setCategoryName(rs.getString("CATEGORY_NAME"));
			cate.setDescription(rs.getString("DESCRIPTION"));
			System.out.println("카테리스트"+cate.getCategoryName());
			list.add(cate);
				
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		return list;
	}
	@Override
	public int countCategories(Proxy pxy) {
		int count = 0;
		try {
			String sql = CategorySQL.COUNT.toString();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			count = rs.getInt("num");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
