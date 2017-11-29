package com.rws.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rws.bean.Employeebean;
import com.rws.bean.Product;

@Path("employee")
public class Helloresource {
	@GET
	@Path("/searchemps")
	@Produces(MediaType.TEXT_PLAIN)
public String searchemployees(@BeanParam Employeebean empbean){
		
	return "deptname="+empbean.getDeptname()+", salary="+empbean.getSalary()+", location="+empbean.getLocation();
}
	@POST
	@Path("/searchproduct")
	@Produces(MediaType.TEXT_PLAIN)
public Product searchproduct(@QueryParam("pid") Integer pid){
		System.out.println("HAI");
		Product p=null;
		if(pid!=null&&pid.equals(101)){
		 p=new Product();
			p.setPid(pid);
			p.setName("hari");
			p.setPrice(200.0);
		}
	return p;
	}
}
