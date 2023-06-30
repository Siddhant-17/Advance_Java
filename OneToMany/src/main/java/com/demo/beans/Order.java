package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order12")
public class Order {

	@Id
	private int oid;
	private String oname;
	@ManyToOne
	@JoinColumn(name="cjoin")
	private Customer cust;
	
	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Order(int oid, String oname) {
		super();
		this.oid = oid;
		this.oname = oname;
	
	}
	public Order() {
		super();
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}

	

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", cust=" + cust + "]";
	}
	

}
