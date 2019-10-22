package com.ashvini.electronicshopping.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ashvini.electronicshopping.dao.CategoryDAO;
import com.ashvini.electronicshopping.dto.Category;

@Repository("cdao")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> cat = new ArrayList<Category>();
	
	static {
		System.out.println("Inside the static block");
		//adding category to the list item
		Category c = new Category();
		
		c.setId(1);
		c.setName("Laptop");
		c.setDescription("This is Laptop description");
		c.setImageURL("lap1.png");
		
		cat.add(c);
		System.out.println(cat);
		
		//Adding 2nd item to category list
		c = new Category();
		c.setId(2);
		c.setName("Mobile");
		c.setDescription("This is Mobile description");
		c.setImageURL("mob1.png");
		
		cat.add(c);
		System.out.println(cat);
		
//		Adding 3rd to category list
		c = new Category();
		c.setId(3);
		c.setName("Television");
		c.setDescription("This is TV description");
		c.setImageURL("TV.png");
		
		cat.add(c);
		System.out.println(cat);
		
		//Adding 4th item to category list
		c = new Category();
		c.setId(4);
		c.setName("Speakers");
		c.setDescription("This is Speakers description");
		c.setImageURL("sp.png");
		
		cat.add(c);
		System.out.println(cat);
		System.out.println("Assigned all the 4 category");
	}
	@Override
	public List<Category> listCategory() {
		System.out.println("Inside the listCategory () to list all the category items");
		System.out.println(cat);
		// TODO Auto-generated method stub
		return cat;
	}
	
	@Override
	public Category get(int id) {
		
		
		for(Category category: cat) {
			if(category.getId()==id) return category;
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
