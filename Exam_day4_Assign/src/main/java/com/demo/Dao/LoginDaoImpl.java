package com.demo.Dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.demo.beans.Question;
import com.demo.beans.Student;

public class LoginDaoImpl implements LoginDao
{
	private static Connection con;
	private static int i=0;
	private static PreparedStatement pist,pqlist;
	
	static {
		con=DBUtil.getMyConnection();
		try {
			pist=con.prepareStatement("insert into exam1 values (?,?,?,?,?,?,?,?);");
			pqlist=con.prepareStatement(" select * from mcq_questions3");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Student loginAuthentication(String uname, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student addStudent(String uname, String pass, String mob, String email1, String sub, String add) {
		try {
			pist.setString(1, uname);
			pist.setString(2, pass);
			pist.setString(3, mob);
			pist.setString(4, email1);
			pist.setString(5, sub);
			pist.setString(6, add);
			pist.setString(7, null);
			pist.setInt(8, 0);
			pist.executeUpdate();
			return new Student(uname,pass,mob,email1,sub,add);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Question> gettAllque() {
		try {
			List<Question> qlist=new ArrayList();
			ResultSet rs=pqlist.executeQuery();
			while(rs.next())
			{
				qlist.add(new Question(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6)));
			}
			return qlist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
