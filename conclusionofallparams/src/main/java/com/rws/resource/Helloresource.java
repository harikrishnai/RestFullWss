package com.rws.resource;

import java.util.List;

import javax.management.MXBean;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rws.domain.Employee;
@Path("employee")
public class Helloresource {
@GET
@Path("/getempdetails")
	public Response getemployee(@DefaultValue("business") @QueryParam("dept") String department,@DefaultValue("delhi") @QueryParam("location") String location){
		String resp="query parameters are receieved 'dept' value is "+department+" and location value is "+location;
		return Response.status(200).entity(resp).build();
	}
@GET
@Path("/getempbydeptno")
@Produces(MediaType.TEXT_PLAIN)
	public String getemp(@DefaultValue("123") @QueryParam("deptno") int deptno){
		return "employee name=hari,empno=101,salary=20000 deptno :"+deptno;
}
@GET
@Path("/getempbydeptname/{deptname}")
@Produces(MediaType.TEXT_PLAIN)
	public String getemp(@PathParam("deptname") Employee emp){
		return "employee name=hari,empno=101,salary=20000 deptname :"+emp.getDeptname();
}
@GET
@Path("/deletedepartments")
@Produces(MediaType.TEXT_PLAIN)
	public String deletedepartments(@DefaultValue("1") @QueryParam("deptno") List<Integer> deptnolist){
       System.out.println("list of depatments:"+deptnolist);
	return "departments deleted";
}











}
