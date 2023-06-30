package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="person22")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person {
	@Id
	private int pid;
	private String pname;
	private String addr;
	public Person(int pid, String pname, String addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.addr = addr;
	}
	public Person() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addr=" + addr + "]";
	}
	
	
}
