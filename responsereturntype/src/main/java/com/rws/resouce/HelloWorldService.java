package com.rws.resouce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rws.domain.Student;
@Path("hello")
public class HelloWorldService {
/*	@GET
	@Path("/sayhello/{name}")
public Response getmsg(@PathParam("name") String name){
	String result="hello "+name+" welcome";
	return Response.status(200).entity(result).build();*/
//	return Response.ok(result).build();
	@GET
	@Path("/getstudentdetails/{sid}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getresult(@PathParam("sid") Integer sid){
		Student std=new Student();
		std.setName("hari");
		std.setSid(sid);
		return Response.status(200).entity(std).build();
	}

}
