package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Customer12")
public class Customer {
	@Id
	private int cid;
	private String cname;
	@OneToMany(mappedBy="cust")
//	@JoinColumn(name="ojoin")
	private List<Order> order;
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, List<Order> order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.order = order;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Order> getOrder() {
		return order;
	}
	public void setOrder(List<Order> order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
