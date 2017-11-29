package com.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ws.domain.Product;
@Path("rest")
public class ProductService {
	@GET
	@Path("/getxml")
	@Produces(MediaType.APPLICATION_XML)
	public Product searchproduct1(@QueryParam("pid") Integer pid) {
		System.out.println("entered into search product1 xml");
		Product p=null;
		if (pid!=null&&pid.equals(301)) {
			p=new Product();
			p.setPid(pid);
			p.setPname("hari");
			p.setPrice(23000.00);
		}
		return p;
	}
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public Product searchproduct2(@QueryParam("pid") Integer pid) {
		System.out.println("entered into search product2 json");
		Product p=null;
		if (pid!=null&&pid.equals(302)) {
			p=new Product();
			p.setPid(pid);
			p.setPname("mouse");
			p.setPrice(300.00);
		}
		return p;
	}
	@GET
	@Path("/getname")
	@Produces(MediaType.TEXT_PLAIN)
	public String searchpoductname(@QueryParam("pid") Integer pid) {
		if (pid!=null&&pid.equals(301)) {
			return "keyword";
		}
		return "product not found";
	}

}
