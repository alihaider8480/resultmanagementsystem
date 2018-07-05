package com.dbo;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbo.LoginConnection;


public class FunctionsQuerys 
{
	/*@Autowired
	private LoginConnection connection; 

	@ModelAttribute
	@RequestMapping(value="/BANK/delete_student_record/{rollnumber}",method=RequestMethod.POST)
	public String pass_fail(@RequestParam(value="rollnumber") int delete_roll) throws SQLException
	{
		connection.create_Connection();
		LoginConnection.pst = LoginConnection.con.prepareStatement("delete student where Roll ="+delete_roll+" ");
		LoginConnection.pst.executeQuery();
		LoginConnection.pst.close();
		
		return "9class";
	}*/
}
