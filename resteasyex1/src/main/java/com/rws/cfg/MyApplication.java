package com.rws.cfg;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.rws.service.HelloResource;

public class MyApplication extends Application {
	private static Set<Object> set=new HashSet<>();
	public MyApplication(){
		HelloResource hr=new HelloResource();
		set.add(hr);
	}
	public Set<Object> getSingletons(){
		return set;
	}
}
