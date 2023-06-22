package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginDaoImpl implements LoginDao{

	private static Connection conn;
	private static PreparedStatement pget;
	
	static {
		
		
		try {
			conn=DBUtil.getConnection();
			System.out.println(conn);
			pget=conn.prepareStatement("select * from user where uname=? and password=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public MyUser validateLogin(String uname, String pass) {
		try {
			pget.setString(1,uname);
			pget.setString(2, pass);
			
			ResultSet rs=pget.executeQuery();
			if(rs!=null)
			{
				rs.next();
				return new MyUser(rs.getString(1),rs.getString(2),"null");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
