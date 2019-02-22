package dao;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryDAO {

	public void createCategory(CategoryDTO cate);
	public List<CategoryDTO> seletCategoryList(Proxy pxy);
	
	public int countCategories(Proxy pxy);
}
