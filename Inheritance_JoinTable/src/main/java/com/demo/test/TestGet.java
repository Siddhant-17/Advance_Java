package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.beans.Student;

public class TestGet {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Person p=sess.get(Student.class, 13);
		System.out.println(p);
		tr.commit();
		sess.close();
		sf.close();
	}

}
