package com.demo.beans;

public class MyRegistration {


	private String uname;
	private String pass;
	private String fullname;
	private String phoneno;
	private String email;
	private String Cpass;
	private String gender;
	
	
	
	public MyRegistration() {
		super();
	}

	public MyRegistration(String uname, String pass, String fullname, String phoneno, String email, String cpass,
			String gender) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.fullname = fullname;
		this.phoneno = phoneno;
		this.email = email;
		Cpass = cpass;
		this.gender = gender;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpass() {
		return Cpass;
	}

	public void setCpass(String cpass) {
		Cpass = cpass;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MyRegistration [uname=" + uname + ", pass=" + pass + ", fullname=" + fullname + ", phoneno=" + phoneno
				+ ", email=" + email + ", Cpass=" + Cpass + ", gender=" + gender + "]";
	}
	
	
	
}
