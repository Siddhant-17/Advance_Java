package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;


public class Tester {

	public static void main(String[] args) {
	
	MyUser u1 = new MyUser(12,"sk","sk@122");
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session sess = sf.openSession();

	Transaction tr = sess.beginTransaction();
	sess.save(u1);
	tr.commit();
	sess.close();
	sf.close();
	}

}
