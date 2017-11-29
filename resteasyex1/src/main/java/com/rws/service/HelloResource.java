package com.rws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloResource {
	@Path("/sayhello/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
public String syahello(@PathParam("name") String name){
	return "hello "+name+" welcome to rest easy!";
}
}
