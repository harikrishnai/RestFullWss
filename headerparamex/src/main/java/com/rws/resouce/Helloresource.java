package com.rws.resouce;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

@Path("users")
public class Helloresource {

	@GET
//	@Path("/getuser")
	public Response getheadersresult(@HeaderParam("user-agent") String useragent){
		System.out.println("getheaderresult metho is calling and user agent is :"+useragent);
		return Response.status(200).entity(useragent).build();
	}
	@GET
	@Path("/get")
	@Produces("text/plain")
	public Response userservice(@Context HttpHeaders headers){
		String useragent=headers.getRequestHeader("user-agent").get(0);
//		below return statement using Response as return type for method
		return Response.status(200).entity("getheaders is called useragent "+useragent).build();
//		below return statement using String  as return type for method
//		return "getheaders is called useragent:"+useragent;
	}
	@GET
	@Path("/getall")
	@Produces("text/plain")
	public Response getallheaders(@Context HttpHeaders headers){
		MultivaluedMap<String,String> map=headers.getRequestHeaders();
	Set<String>	keys=map.keySet();
	for(String key:keys){
		System.out.println("header name:"+key);
		List<String> headervalues=headers.getRequestHeader(key);
		for(String headervalue:headervalues){
			System.out.println(headervalue);
		}
	}
	return Response.status(200).build();
}
	@GET
	@Path("/getallcookies")
	@Produces("text/plain")
	public Response getallcookies(@Context HttpHeaders headers){
		Map<String,Cookie> map=headers.getCookies();
		System.out.println(map.size());
		return Response.ok("ok").build();
	}
	
//	by using @CookiParam annotation
	
	@GET
	@Path("/getcookie")
	@Produces("text/plain")
	public String getcookie(@CookieParam("cookie-name") Cookie cookie){
		System.out.println(cookie);
	return "ok";
	}
	
	@GET
	@Path("/getcookievalue")
	@Produces("text/plain")
	public String getcookievalue(@CookieParam("name") String cookie){
		System.out.println(cookie);
	return "ok";
	}
	
	
	
	
	
	
	
	
	
	
}