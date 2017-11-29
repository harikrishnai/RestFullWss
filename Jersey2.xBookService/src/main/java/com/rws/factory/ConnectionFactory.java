package com.rws.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
static
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		System.out.println("exception occured while loading the driver class"+e.getMessage());
	}
}
public static Connection getconnection() throws SQLException{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String uname="system";
	String pwd="oracle";
	Connection con=DriverManager.getConnection(url,uname,pwd);
	return con;
}
}
