package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementExaple {

	public static void main(String[] args) {
		
System.out.println("Start ****** Statement example");
System.out.println();
	
try {
	//1 .Load the driver
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1. Driver Classe load with sccess");
	//2. Get the connection
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","root12345");
	System.out.println("2 - Connection Established");	
	
	
	//3.. Create the connection
	Statement stmt = con.createStatement();
	System.out.println("create statement done");
	 
	//4. prepare the query to execute
	ResultSet rs= stmt.executeQuery("select* from employees");
	System.out.println("ececute query");
	while(rs.next() ) {
		System.out.println(""
				+ "id- " +rs.getInt(1) + " " +
				"Age " + rs.getInt(2) + " " +
				"First Name " + rs.getString(3) + " " +
				"Last Name  " + rs.getString(4));
	}
		//5 - Close the Ressources
		System.out.println("Close the resource");
		con.close();
		stmt.close();
		rs.close();
		
	
} catch(Exception e) {
	e.printStackTrace();
}
}
}
