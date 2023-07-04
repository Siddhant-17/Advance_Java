package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public List<Product> getAllprodct() {
		return jdbctemplate.query("select * from product",(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			p.setQty(rs.getInt(4));
			return p;
		});
	}

}
