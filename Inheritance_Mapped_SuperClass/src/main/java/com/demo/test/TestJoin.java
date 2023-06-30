package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Student;

public class TestJoin {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Employee e=new Employee(12,"Rajat","pune",21,1500);
		Student s=new Student(13,"Swati","mumbai","DBDA",78);
		sess.save(e);
		sess.save(s);
		tr.commit();
		sess.close();
		sf.close();
	}

}
//tr.commit()   ==== if you go in sbi atm with hdfc atm card and if u make transaction in sbi atm and if light is  of after transaction 
//both databases are update on balance  so after that u get money transaction completed after commit done susfully