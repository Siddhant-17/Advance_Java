package com.demo.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		
			try {
				//step 1:register the Driver Class
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				
				//step 2:Connect to database
				String url="jdbc:mysql://192.168.10.150:3306/dac41";
				Connection con=DriverManager.getConnection(url,"dac43","welcome");
					//create connection object and connect to the database
				if(con!=null)
					System.out.println("connected");
				else
					System.out.println("not connected");
				
				//step 3:create statement
				Statement st=con.createStatement();
				//step 4 :execute query
				ResultSet re=st.executeQuery("select * from student");
						while(re.next()) {
							System.out.println(re.getInt(1));
							
						}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
