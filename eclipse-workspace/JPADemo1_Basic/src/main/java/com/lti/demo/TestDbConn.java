package com.lti.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDbConn {
	public static void main(String[] args) throws SQLException
	{
	String url = "jdbc:oracle:thin:@localhost:1521/ORCL";
	Connection conn=DriverManager.getConnection(url,"scott","tiger");
	if (conn != null)
	{
	System.out.println("Connected");
	conn.close();
	}
	}

}
