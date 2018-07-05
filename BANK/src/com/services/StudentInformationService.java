package com.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dbo.LoginConnection;
import com.interfaces.StudentInterface;
import com.pojo.StudentPojo;

@Component
public class StudentInformationService implements StudentInterface
{
	@Autowired 
	private LoginConnection connection;
	
	
	  
	@Override
	public String student_information(StudentPojo studentpojo_obj4) 
	{ 
		try
		{    
			connection.create_Connection();
			LoginConnection.pst = LoginConnection.con.prepareStatement("INSERT INTO student(ROLL,NAME,FATHERNAME,CLASS,SECTION,CONTACT) VALUES(?,?,?,?,?,?)");
			LoginConnection.pst.setInt(1, studentpojo_obj4.getRoll());
			LoginConnection.pst.setString(2, studentpojo_obj4.getName());
			LoginConnection.pst.setString(3, studentpojo_obj4.getFathername());
			LoginConnection.pst.setString(4, studentpojo_obj4.getClasss());
			LoginConnection.pst.setString(5, studentpojo_obj4.getSection());
			LoginConnection.pst.setString(6, studentpojo_obj4.getContact());
            LoginConnection.pst.executeQuery();
			LoginConnection.pst.close();      
	    } 
		catch 
		(SQLException e) 
		{
			if(e.toString().indexOf("Cannot insert duplicate key in object")>=0)
			{
					return "Cannot insert duplicate Roll Number";
			}
		}
		return "Insert Successfuly";
	}
}
