package com.services;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.dbo.LoginConnection;
import com.interfaces.LoginInterface;
import com.pojo.LoginPojo;
 
@Component
public class LoginServices  implements LoginInterface
{
	@Autowired
	private LoginConnection connection; 
	
	public	boolean login(LoginPojo loginpojo_obj4) throws SQLException
	{
	    connection.create_Connection();
		LoginConnection.pst = LoginConnection.con.prepareStatement("select userName,password from login where userName =? and password =?");
		LoginConnection.pst.setString(1, loginpojo_obj4.getName());
		LoginConnection.pst.setInt(2, loginpojo_obj4.getPassword());
		LoginConnection.rs=LoginConnection.pst.executeQuery();
		while(LoginConnection.rs.next())
		{
			if(LoginConnection.rs.getString(1).equals(loginpojo_obj4.getName()) && LoginConnection.rs.getString(2).equals(String.valueOf(loginpojo_obj4.getPassword())))
			{			
					return true;
			}			
		}
		return false;
	}
	
	@ModelAttribute
	public	String  cheack_login_valid(HttpServletRequest request,HttpSession sessions,Model model)
	{
		
		 try 
		  {	
	    	 if((sessions.getValue("session_name").equals(sessions.getValue("session_name"))) && (sessions.getValue("session_name").equals(sessions.getValue("session_name"))))
		  	 {	  	
	    		 return "succees";
			 }
	      } 
		  catch (Exception e) 
		  {
			       // if session is not have your browser and you access /homepage so error will create then catch block execute
			   model.addAttribute("login_error","Please First you need login");
			   return "Login";
	       }
		return "succees";
	}
}
