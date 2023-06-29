package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int aid;
	private String street,city;
	@OneToOne(mappedBy="addr")
	
	private Student student;
	
	public Address() {
		super();
	}
	public Address(int aid, String street, String city, Student student) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.student = student;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", student=" + student + "]";
	}
	
	
}
