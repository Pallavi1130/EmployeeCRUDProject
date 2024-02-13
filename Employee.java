package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int empid;
private String empname;
private String empdept;
private int empsal;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}
public int getEmpsal() {
	return empsal;
}
public void setEmpsal(int empsal) {
	this.empsal = empsal;
}
public Employee(String empname, String empdept, int empsal) {
	super();
	this.empname = empname;
	this.empdept = empdept;
	this.empsal = empsal;
}
public Employee() {
	super();
	
}
public Employee(int empid, String empname, String empdept, int empsal) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empdept = empdept;
	this.empsal = empsal;
}


}
