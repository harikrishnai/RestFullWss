package com.jacksonapiusingutil.util;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static ObjectMapper mapper;
	static
	{
		mapper=new ObjectMapper();
	}
	public static String convertjavatojson(Object obj){
		String json="";
			try {
				json=mapper.writeValueAsString(obj);
			} catch (IOException e) {
				e.printStackTrace();
			}
		return json;
	}
	public static <T> T convertjsontojava(String jsonstr,Class<T> targetcls) {
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
