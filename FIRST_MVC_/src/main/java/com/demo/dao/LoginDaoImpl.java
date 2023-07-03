package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public MyUser validate(String uname, String pass) {
	try {
		return jdbctemplate.queryForObject("select * from myuser where uname=? and pass=?", new Object[] {uname,pass},
		BeanPropertyRowMapper.newInstance(MyUser.class));
	}
	catch(Exception e)
	{
		System.out.println("not found");
	}
	return null;
	}
}

