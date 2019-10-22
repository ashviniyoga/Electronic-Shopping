package com.ashvini.electronicshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ashvini.electronicshopping.dao.CategoryDAO;
import com.ashvini.electronicshopping.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO cdao;
	
	@RequestMapping(value = {"/","/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","AshHome");
		System.out.println("after the title added in model view");
		mv.addObject("categories",cdao.listCategory());
		System.out.println("After the list cat() called in model view");
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value = "greeting", required=false) String greeting) {
//		
//		if(greeting==null) {
//			greeting = "good bye";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting", greeting);
//		return mv;
//		
//	}
	
//	@RequestMapping(value="/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting")String greeting) {
//		
//		if(greeting==null) {
//			greeting = "good bye";
//		}
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting","Welcome to true");
//		return mv;
//		
//	}
	
	//Request mapping to the controller 
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","ASHAbout Us");
		System.out.println("Inside the About section");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value = {"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","AshContact");
		System.out.println("Inside the Contact section");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/* Method to load all the prodcts */
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Product");
		System.out.println("Inside the SHOW ALL PRODUCT section");
		mv.addObject("categories",cdao.listCategory());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	/* Method to load only one products */
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCategoryProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		Category category = null;
		category = cdao.get(id);
		System.out.println("Inside the SHOW CATEGORY ID PRODUCT section");
		mv.addObject("title",category.getName());
		//to display list of category
		mv.addObject("categories",cdao.listCategory());
		//to display single category
		mv.addObject("category", category);
		System.out.println("category" + category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
	
	
}
