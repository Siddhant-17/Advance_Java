package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDaoImpl implements RegisterDao {
	private static Connection conn;
	private static PreparedStatement pins;
	
	static {
		conn=DBUtil.getConnection();
		try {
			pins=conn.prepareStatement("insert into registerUser values(?,?,?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int addUser(String uname, String pass, String fullname, String phoneno, String email, String cpass,
			String gender) {
		try {
			pins.setString(1,uname);
//			pins.setString(2,pass);
			pins.setString(2,fullname);
			pins.setString(3,phoneno);
			pins.setString(4,email);
			pins.setString(5,cpass);
			pins.setString(6,gender);
			
			return pins.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
}
