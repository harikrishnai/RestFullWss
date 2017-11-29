package com.rws.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jerseyutil.domain.Book;
import com.jerseyutil.domain.ResponseDTO;
import com.jerseyutil.util.JsonUtil;



public class BookServiceClient {
public ResponseDTO savebookdetails(Book book){
	String url="http://localhost:8888/Jersey2.xBookService/rest/books/registerbook";
//	jersey 2.x client code
	ResponseDTO rdto=new ResponseDTO();
	Client client=ClientBuilder.newClient();
	WebTarget target=client.target(url);
	Builder builder=target.request();
	builder.accept(MediaType.APPLICATION_JSON);
	Response clientresponse=builder.post(Entity.entity(book,MediaType.APPLICATION_JSON),Response.class);
	String jsonresponse=clientresponse.readEntity(String.class);
	 rdto=JsonUtil.convertjsontojava(jsonresponse, ResponseDTO.class);
	return rdto;
	
	
}
}
