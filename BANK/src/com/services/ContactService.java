package com.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dbo.LoginConnection;
import com.pojo.ContactPojo;

@Component
public class ContactService 
{
	@Autowired 
	private LoginConnection connection;
	
	@RequestMapping
	public String usercontact(ContactPojo contactpojo_obj2)
	{
		try 
		{
		    connection.create_Connection();
			LoginConnection.pst = LoginConnection.con.prepareStatement("INSERT INTO contact VALUES(?,?)");
			LoginConnection.pst.setString(1, contactpojo_obj2.getName());
			LoginConnection.pst.setString(2, contactpojo_obj2.getMessage());
			LoginConnection.pst.executeQuery();		
		}
		catch (SQLException e) 
		{
			System.out.println("Error1"+e);
		}		
		return "Thanks For Submitted";		
	}
}
