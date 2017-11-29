package com.rws.bean;

import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Employeebean {
@QueryParam("deptname")	
private String deptname;
@QueryParam("location")	
private String location;
@QueryParam("salary")	
private double salary;
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
