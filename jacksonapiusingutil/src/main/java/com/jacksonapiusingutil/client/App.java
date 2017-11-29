package com.jacksonapiusingutil.client;

import com.jacksonapiusingutil.domain.Student;
import com.jacksonapiusingutil.util.JsonUtil;

public class App 
{
    public static void main( String[] args )
    {
  Student std= new Student();
    	std.setSid(101);
    	std.setSname("hari");
    	std.setCourse("java");
    	String jsonstudent=JsonUtil.convertjavatojson(std);
    	System.out.println(jsonstudent);
    	Student std1=JsonUtil.convertjsontojava(jsonstudent, Student.class);
    	System.out.println(std1.getSid()+" "+std1.getSname()+" "+std1.getCourse());
    }
}
