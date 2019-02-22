package service;

import java.util.List;

import domain.CategoryDTO;
import proxy.Proxy;

public interface CategoryService {

	public void registCategory(CategoryDTO cate);
	public List<CategoryDTO> bringCategoryList(Proxy pxy);
	
	public int countCategories(Proxy pxy);
}
