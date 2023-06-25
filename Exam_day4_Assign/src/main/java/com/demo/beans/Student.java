package com.demo.beans;

public class Student {

	private String uname2;
	private  String pass2; 
	private String mob;
	private String email; 
	private String sub;
	private String add;
	private String status;
	private int marks;
	
	public Student(String uname2, String pass2, String mob, String email, String sub, String add, String status,
			int marks) {
		super();
		this.uname2 = uname2;
		this.pass2 = pass2;
		this.mob = mob;
		this.email = email;
		this.sub = sub;
		this.add = add;
		this.status = status;
		this.marks = marks;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student() {
		super();
	}
	public String getUname2() {
		return uname2;
	}
	public void setUname2(String uname2) {
		this.uname2 = uname2;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [uname2=" + uname2 + ", pass2=" + pass2 + ", mob=" + mob + ", email=" + email + ", sub=" + sub
				+ ", add=" + add + ", status=" + status + ", marks=" + marks + "]";
	}

	public Student(String uname2, String pass2, String mob, String email, String sub, String add) {
		super();
		this.uname2 = uname2;
		this.pass2 = pass2;
		this.mob = mob;
		this.email = email;
		this.sub = sub;
		this.add = add;
	}
	
	

	
	
}
