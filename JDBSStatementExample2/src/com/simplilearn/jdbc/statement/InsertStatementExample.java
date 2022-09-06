package com.simplilearn.jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//we need to write JDBC Program to insert the data into my sql database*/


public class InsertStatementExample {
	public static void main(String[] args) {
	
	System.out.println("Start ****** Statement example");

		
	try {
		//1 .Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. Driver Classe load with sccess");
		//2. Get the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/simplilearn","root","root12345");
		System.out.println("2 - Connection Established");	
		
		
		//3.. Create the connection
		Statement stmt = con.createStatement();
		System.out.println("create statement done");
		 
		//4. prepare the query to execute
		int record= stmt.executeUpdate("insert into Employees VALUES (107,70,'ahmad','salem')");
		//if record = 0  means no record inserted if record >0 means record inserted successful
		
		System.out.println("record::" + record);
		System.out.println("4 . Prepare the query and execute");
		
		
			//5 - Close the Ressources
			System.out.println("Close the resource");
			con.close();
			stmt.close();
			//rs.close();
			
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	}

}
