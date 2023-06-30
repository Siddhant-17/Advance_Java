package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp44")
public class Employee extends Person {

	private int deptno;
	private int sal;
	public Employee(int pid, String pname, String addr,int deptno, int sal) {
		super(pid,pname,addr);
		this.deptno = deptno;
		this.sal = sal;
	}
	public Employee() {
		super();
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [deptno=" + deptno + ", sal=" + sal + "]";
	}
	
	
}
