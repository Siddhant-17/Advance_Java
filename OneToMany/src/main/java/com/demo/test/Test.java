package com.demo.test;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.demo.beans.*;

public class Test {

	public static void main(String[] args) {
		
//		Order or=new Order(1,"phones");
//		Order or2=new Order(2,"bags");
//		Order or3=new Order(3,"pc");
//		List<Order> olist=new ArrayList();
//		olist.add(or);
//		olist.add(or2);
//		olist.add(or3);
//		Customer cut=new Customer(1,"sid",olist);
//		
//		or.setCust(cut);
//		or2.setCust(cut);
//		or3.setCust(cut);
//		cut.setOrder(olist);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
//		sess.save(or);
//		sess.save(or2);
//		sess.save(or3);
//		sess.save(cut);
		Customer c=sess.get(Customer.class,1);
		System.out.println();
		tr.commit();
		sess.close();
		sf.close();
		
	}
}
