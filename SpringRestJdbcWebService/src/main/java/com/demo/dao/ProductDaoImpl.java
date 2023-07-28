package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Product;


@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	   JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProduct() {
		
		return jdbcTemplate.query("select * from prod22",(rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getFloat(4));
			return p;
		});
	}

	@Override
	public Product getById(int pid) {
		try {
		return jdbcTemplate.queryForObject("select * from prod22 where pid=?", new Object [] {pid},BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}

}

	@Override
	public int addProduct(Product p) {
		
		try {
			return jdbcTemplate.update("insert into prod22 values(?,?,?,?)",new Object[] {
					p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
			}catch(DataAccessException e) {
				return 0;
			}
	}

	@Override
	public int updateProduct(Product p) {
		try {
			return jdbcTemplate.update("update prod22 set pname=?,qty=?,price=? where pid=?" ,new Object[] {
					p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
			}catch(DataAccessException e) {
				return 0;
			}
	}

	@Override
	public int deleteById(int pid) {
		try {
			  return jdbcTemplate.update("delete from prod22 where pid=?" ,new Object[] {pid});
			}catch(DataAccessException e) {
				return 0;
			}
		
	}
	
}
