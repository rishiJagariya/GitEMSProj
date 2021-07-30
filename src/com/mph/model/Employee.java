package com.mph.model;

public class Employee {
private int empno;
@Override
public String toString() {
	return "Employee [empno=" + empno + ", ename=" + ename + ", dept=" + dept + "]";
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public Employee(int empno, String ename, String dept) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.dept = dept;
}
private String ename;
private String dept;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
