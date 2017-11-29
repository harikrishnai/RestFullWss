package com.rws.client;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.springframework.web.client.RestTemplate;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
//    	create client request obj
        String url="http://localhost:8888/resteasyex1/hari/hello/sayhello/{name}";
        
        /*ClientRequest creq=new ClientRequest(url);
        creq.accept(MediaType.TEXT_PLAIN);
        ClientResponse cres=creq.get(ClientResponse.class);
        String response=(String)cres.getEntity(String.class);
        System.out.println(response);*/
 //        spring f.w provided RestTemplate class.RestTemplate class having methods are getForObject(),postForObject() 
        RestTemplate rt=new RestTemplate();
        Map<String, Object> map=new HashMap<>();
        map.put("name","Hari");
        String result=rt.getForObject(url, String.class, map);
    	System.out.println(result);
    }
}
