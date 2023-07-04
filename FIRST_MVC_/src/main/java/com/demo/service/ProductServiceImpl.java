package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductDao pd;
	
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pd.getAllprodct();
	}

}
