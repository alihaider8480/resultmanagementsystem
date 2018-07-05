package com.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.dbo.LoginConnection;
import com.pojo.NinePojo;
import com.pojo.StudentPojo;
import com.pojo.TenPojo;
@Component
public class FunctionServices 
{
	HttpServletResponse response;
	HttpServletRequest request;
	
	@Autowired
	private LoginConnection connections; 
	
	public String pass_fail(String r) 
	{
	  try
	  {
		connections.create_Connection();
		LoginConnection.pst = LoginConnection.con.prepareStatement("delete student where Roll = "+Integer.parseInt(r)+"");
		LoginConnection.pst.executeQuery();
		LoginConnection.pst.close();
	  }
	  catch (Exception e) {
	}
	  return "Delete Successfuly";
	}
	 
	public List<String> search_student(String getroll) 
	{
		List<String> li= new ArrayList<String>();
	  try
	  {
		connections.create_Connection();                             
		LoginConnection.pst =  LoginConnection.con.prepareStatement("SELECT Roll,NAME,SUBJECT1,SUBJECT2,SUBJECT3,SUBJECT4,SUBJECT5,COM_BIO,GAIN,PERCENTAGE,CLASS FROM student WHERE ROLL="+getroll+"");
		LoginConnection.rs= LoginConnection.pst.executeQuery();
		
			if(LoginConnection.rs.next())
			{
				String Roll = LoginConnection.rs.getString(1);
				String Name = LoginConnection.rs.getString(2);
				String Subject1 = LoginConnection.rs.getString(3);
				String Subject2 = LoginConnection.rs.getString(4);
				String Subject3 = LoginConnection.rs.getString(5);
				String Subject4 = LoginConnection.rs.getString(6);
				String Subject5 = LoginConnection.rs.getString(7);
				String com_bio = LoginConnection.rs.getString(8);
				String Gain = LoginConnection.rs.getString(9);
				String percentage = LoginConnection.rs.getString(10);
				String classes = LoginConnection.rs.getString(11);
				
				li.add(Roll);
				li.add(Name);
				li.add(Subject1);
				li.add(Subject2);
				li.add(Subject3);
				li.add(Subject4);
				li.add(Subject5);
				li.add(com_bio);
				li.add(Gain);
				li.add("450");
				li.add(percentage);
				li.add(classes);
		     	
		 }
			else
			{
				li.add("p");
			}
		LoginConnection.rs.close();
	 }
	  catch (Exception e) 
	  {
		 System.out.println("hh"+e);
	  }
	 return li;
	}
	
	public String edit_student_name_final(StudentPojo studentpojo_obj3,NinePojo ninepojo_obj3,TenPojo tenpojo_obj3) 
	{
	  try
	  {  
		connections.create_Connection();
		LoginConnection.pst =  LoginConnection.con.prepareStatement("update student set NAME=?,FATHERNAME=?,CLASS=?,SECTION=?,CONTACT=?,SUBJECT1=?,SUBJECT4=?,SUBJECT5=?,SUBJECT2=?,SUBJECT3=?,COM_BIO=?,GAIN=?,PERCENTAGE=?   where ROLL="+studentpojo_obj3.getRoll()+"");
		LoginConnection.pst.setString(1, studentpojo_obj3.getName());
		LoginConnection.pst.setString(2, studentpojo_obj3.getFathername());
		LoginConnection.pst.setString(3, studentpojo_obj3.getClasss());
		LoginConnection.pst.setString(4, studentpojo_obj3.getSection());
		LoginConnection.pst.setString(5, studentpojo_obj3.getContact());	
		LoginConnection.pst.setFloat(6,  ninepojo_obj3.getEnglish());
		LoginConnection.pst.setFloat(7,  ninepojo_obj3.getPhysics());
		LoginConnection.pst.setFloat(8,  ninepojo_obj3.getMath());
	
		if(tenpojo_obj3.getUrdu()==0.0 && tenpojo_obj3.getIslamiat()==0.0)
		{
			LoginConnection.pst.setFloat(9,  ninepojo_obj3.getSindhi());
			LoginConnection.pst.setFloat(10,  ninepojo_obj3.getComputer_biology());
			LoginConnection.pst.setString(11,  ninepojo_obj3.getCheck_com_bio());
		}
		else 
		{
			LoginConnection.pst.setFloat(9,  tenpojo_obj3.getUrdu());
			LoginConnection.pst.setFloat(10,  tenpojo_obj3.getIslamiat());
			LoginConnection.pst.setString(11,  "Null");
		}
		
		float a=ninepojo_obj3.getEnglish()+ninepojo_obj3.getSindhi()+ninepojo_obj3.getComputer_biology()+ninepojo_obj3.getPhysics()+ninepojo_obj3.getMath()+tenpojo_obj3.getUrdu()+tenpojo_obj3.getIslamiat();
		LoginConnection.pst.setFloat(12,  a);
		
		a= (a/450); 
		a=a*100;
		
		LoginConnection.pst.setFloat(13,  a);
		LoginConnection.pst.executeQuery();
		LoginConnection.pst.close();
		}
	  catch (Exception e) {
	}
	  return "Update Successfuly";
	}
}