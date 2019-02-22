package service;

import java.util.List;

import dao.CategoryDAOImpl;
import domain.CategoryDTO;
import proxy.Proxy;

public class CategoryServiceImpl implements CategoryService{
	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	private CategoryServiceImpl() {
		dao = CategoryDAOImpl.getInstance();
	}
	public static CategoryServiceImpl getInstance() {return instance;}
	CategoryDAOImpl dao;

	@Override
	public void registCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> bringCategoryList(Proxy pxy) {
		
		return dao.seletCategoryList(pxy);
	}
	@Override
	public int countCategories(Proxy pxy) {
		
		return dao.countCategories(pxy);
	}

}
