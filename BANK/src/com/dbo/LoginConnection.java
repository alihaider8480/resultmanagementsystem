package com.dbo;

import java.sql.*;

import org.springframework.stereotype.Repository;

@Repository
public class LoginConnection 
{
	 public static Connection con=null;
	 public static ResultSet  rs =null;
	 public static PreparedStatement pst=null;
	 public static Statement st=null;
	 

   public void create_Connection()
    {
	   try
	   {
		   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=ResultManagementSystems;User=test;Password=12345");

		 st = con.createStatement();
	   }
	   catch (Exception e) 
	   {
		System.out.println(e);
	   	}
    }
}