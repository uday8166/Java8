package com.te.JDBC_Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?user=root&password=admin"); 
			PreparedStatement statement=connection.prepareStatement("create table users(uid int primary key, uname varchar(10), uplace varchar(10))"); 
			statement.executeUpdate();  
			} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
