package com.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbo.LoginConnection;
import com.interfaces.NineInterface;
import com.pojo.NinePojo;
@Component
public class NineService  implements NineInterface 
{

	@Autowired
	private LoginConnection loginconnection_obj;
	
	
	@Override
	public String nine_result_insert(NinePojo ninepojo_obj4) throws SQLException 
	{
		try 
		{
		loginconnection_obj.create_Connection();
		LoginConnection.pst =  LoginConnection.con.prepareStatement("update student set SUBJECT1=?,SUBJECT2=?,COM_BIO=?,SUBJECT3=?,SUBJECT4=?,SUBJECT5=?,TOTAL=?,GAIN=?,PERCENTAGE=? where ROLL=?");
		LoginConnection.pst.setFloat(1,  ninepojo_obj4.getEnglish());
		LoginConnection.pst.setFloat(2,  ninepojo_obj4.getSindhi());
		LoginConnection.pst.setString(3,  ninepojo_obj4.getCheck_com_bio());
		LoginConnection.pst.setFloat(4,  ninepojo_obj4.getComputer_biology());
		LoginConnection.pst.setFloat(5,  ninepojo_obj4.getPhysics());
		LoginConnection.pst.setFloat(6,  ninepojo_obj4.getMath());
		LoginConnection.pst.setString(7,  "450");
		
		float a=ninepojo_obj4.getEnglish()+ninepojo_obj4.getSindhi()+ninepojo_obj4.getComputer_biology()+ninepojo_obj4.getPhysics()+ninepojo_obj4.getMath();
		LoginConnection.pst.setFloat(8,  a);
		
		a= (a/450); 
		a=a*100;
		
		LoginConnection.pst.setFloat(9, a);
		LoginConnection.pst.setInt(10, ninepojo_obj4.getRoll());	
		LoginConnection.pst.executeQuery();
		LoginConnection.pst.close();    

		}
		catch (Exception e)
		{
			return "Try Again";
		}
		return "Insert SuccessFuly";
	}
}
