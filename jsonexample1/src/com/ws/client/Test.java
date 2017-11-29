package com.ws.client;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ws.bean.Student;

public class Test {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Student std=new Student();
		std.setSid(101);
		std.setSname("hari");
		std.setSmobile("9999999");
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(std);
		System.out.println(json);
		Student std1=mapper.readValue(json, Student.class);
		System.out.println(std1.getSid()+" "+std1.getSname()+" "+std1.getSmobile());
		
		
		
	}

}
