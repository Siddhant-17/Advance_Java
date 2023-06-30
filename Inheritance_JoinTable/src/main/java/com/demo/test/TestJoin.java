package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Student;

public class TestJoin {

	public static void main(String[] args) {
		
		Employee e=new Employee(12,"Rajat","pune",12,232313);
		Student s=new Student(13,"Swati","mumbai","DBDA",78);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session sess=factory.openSession();  //not synchronize
		Transaction tr=sess.beginTransaction();
		sess.save(e);
		sess.save(s);
		tr.commit();
		sess.close();
		factory.close();
	}

}
//tr.commit()   ==== if you go in sbi atm with hdfc atm card and if u make transaction in sbi atm and if light is  of after transaction 
//both databases are update on balance  so after that u get money transaction completed after commit done susfully