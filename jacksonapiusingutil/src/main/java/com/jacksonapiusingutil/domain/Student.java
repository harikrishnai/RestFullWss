package com.jacksonapiusingutil.domain;

import java.io.Serializable;



public class Student implements Serializable {
	private Integer sid;
	private String sname;
	private String course;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
