package com.jerseyutil.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class JsonUtil {
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static String convertjavatojson(Object obj){
		System.out.println("entered into javatojson conversion");
		String json="";
				try {
					json=mapper.writeValueAsString(obj);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
			
		return json;
	}
	
	public static <T> T convertjsontojava(String jsonstr,Class<T> targetcls) {
		System.out.println("entered into jsontojava conversion");
		T response=null;
		try {
			response=mapper.readValue(jsonstr, targetcls);
		} catch (JsonParseException e) {
			e.printStackTrace();
		}catch(JsonMappingException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return response;
		
	}

}
