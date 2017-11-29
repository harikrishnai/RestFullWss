package com.rws.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
private Integer sid;
private String name;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
