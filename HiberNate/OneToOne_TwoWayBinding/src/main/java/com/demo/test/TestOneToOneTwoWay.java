package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class TestOneToOneTwoWay {

	public static void main(String[] args) {
		
//		Student st=new Student(2,"sourabh",null);
//		Address addr=new Address(2,"katraj","solapur",st);
//		st.setAddr(addr);
////		addr.setStudent(st);
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
//		Session sess=sf.openSession();
//		Transaction tr=sess.beginTransaction();
		
//		sess.save(st);
//		sess.save(addr);
//		tr.commit();
//		sess.close();
//		sf.close();
		
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		Student s=ses.load(Student.class,2);
		tr.commit();
		ses.close();
		sf.close();
		System.out.println(s.getSname());
	
	
	}
}
