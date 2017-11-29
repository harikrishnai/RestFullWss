package com.rws.client;



import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;


public class Test {

	public static void main(String[] args) {
		String url="http://localhost:8888/jersey1/rest/getxml?pid=301";
        Client client=Client.create();
        WebResource webresource =client.resource(url);
        Builder builder= webresource.accept(MediaType.APPLICATION_XML);
        ClientResponse response=builder.get(ClientResponse.class);
       String json =response.getEntity(String.class);
       System.out.println(response.getStatus()+"="+response.getStatusInfo());
       System.out.println(json);
	}

}
