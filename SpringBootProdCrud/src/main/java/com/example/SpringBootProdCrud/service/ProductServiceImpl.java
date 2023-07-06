package com.example.SpringBootProdCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootProdCrud.beans.Product;
import com.example.SpringBootProdCrud.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productdao;

	public List<Product> getAllProducts() {
		List<Product> plist= productdao.findAll();
		System.out.println(plist);
		return plist;
		
	}


}
