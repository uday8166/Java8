package com.te.JDBC_Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
public static void main(String[] args) {
	
	try {
		Connection connection=DriverManager.getConnection("jdbc:mysql:\\\\localhost:3306\\employee?user=root&password=admin");
		PreparedStatement statement= connection.prepareStatement("insert into users values (?,?,?)");  
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
