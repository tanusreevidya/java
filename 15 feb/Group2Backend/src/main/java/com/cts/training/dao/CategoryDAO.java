package com.cts.training.dao;

import java.util.List;

import com.cts.training.model.Category;
import com.cts.training.model.Product;

public interface CategoryDAO {

	public boolean saveOrUpdateCategory(Category category);

	public boolean deleteCategory(Category category);

	public Category getCategoryById(int Id);

	public List<Category> getAllCategories();
}
