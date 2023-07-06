package com.example.SpringBootProdCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBootProdCrud.beans.Product;
import com.example.SpringBootProdCrud.service.ProductServiceImpl;

@Controller
public class ProductController {

	@Autowired
	private ProductServiceImpl productservice;
	
	@GetMapping("/showproduct")
	public ModelAndView getAllProduct()
	{
		List<Product> plist=productservice.getAllProducts();
		System.out.println(plist);
		return new ModelAndView("displayproduct","plist",plist);
	}
	
	
	//when user click annnew product then empty product object will go in product pages and their user fill value
	@GetMapping("/addnewproduct")
	public String displayproductform(Model model) {
		Product p=new Product();
		model.addAttribute("product",p);
		return "addproduct";
	} 
	
	
 }
