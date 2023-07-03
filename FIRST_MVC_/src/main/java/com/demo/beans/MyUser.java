package com.demo.beans;

public class MyUser {
	private String uname;
	private String pass;
	private String role;
	public MyUser(String uname, String pass, String role) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.role = role;
	}
	public MyUser() {
		super();
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", pass=" + pass + ", role=" + role + "]";
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
