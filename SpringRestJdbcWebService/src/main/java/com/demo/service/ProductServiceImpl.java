package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
    private ProductDao productDao;

	@Override
	public List<Product> getallProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		return productDao.getById(pid);
	}

	@Override
	public int addProduct(Product p) {
		
		return productDao.addProduct(p);
	}

	@Override
	public int updateProduct(Product p) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(p);
	}

	@Override
	public int deleteById(int pid) {
		
		return productDao.deleteById(pid);
	}

}
