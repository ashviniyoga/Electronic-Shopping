package com.ashvini.electronicshopping.dao;

import java.util.List;

import com.ashvini.electronicshopping.dto.Category;

public interface CategoryDAO {

	//To list all the category
	List<Category> listCategory();
	
	Category get(int id);	
	
}
