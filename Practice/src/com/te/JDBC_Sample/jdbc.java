package com.te.JDBC_Sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
public static void main(String[] args) {
	
 
	Connection connection;
	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oracle?user=root&password=admin");
		   Statement statement= connection.createStatement();
		  
		     String qry= "select ename,sal*2 from emp  where empno=10";
		     ResultSet resultSet       =      statement.executeQuery(qry);
		     while (resultSet.next()) {
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getInt(6));
			}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}
}
