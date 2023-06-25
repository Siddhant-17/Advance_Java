package com.demo.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static Connection con;
	
	
	public static Connection getMyConnection()
	{
		if(con==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/sid";
				con=DriverManager.getConnection(url,"root","siddhant");
				if(con!=null)
				{
					System.out.println("connection done");
					return con;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return con;
	}
	public void closeMyConnection()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
