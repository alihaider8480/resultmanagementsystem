package com.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbo.LoginConnection;
import com.interfaces.TenInterface;
import com.pojo.TenPojo;

@Component
public class TenService implements TenInterface
{
	@Autowired
	private LoginConnection loginconnection_obj;
	

	@Override
	public String ten_result_insert(TenPojo tenPojo_obj4) throws SQLException {
		try
		{
		loginconnection_obj.create_Connection();
		LoginConnection.pst =  LoginConnection.con.prepareStatement("update student set SUBJECT1=?,SUBJECT2=?,SUBJECT3=?,SUBJECT4=?,SUBJECT5=?,TOTAL=?,GAIN=?,PERCENTAGE=? where ROLL=?");
		LoginConnection.pst.setFloat(1,  tenPojo_obj4.getEnglish());
		LoginConnection.pst.setFloat(2,  tenPojo_obj4.getUrdu());
		LoginConnection.pst.setFloat(3, tenPojo_obj4.getIslamiat());
		LoginConnection.pst.setFloat(4,  tenPojo_obj4.getPhysics());
		LoginConnection.pst.setFloat(5,  tenPojo_obj4.getMath());
		LoginConnection.pst.setString(6,  "450");
		
		float a=tenPojo_obj4.getEnglish()+tenPojo_obj4.getUrdu()+tenPojo_obj4.getIslamiat()+tenPojo_obj4.getPhysics()+tenPojo_obj4.getMath();
		LoginConnection.pst.setFloat(7,  a);
		a= (a/450); 
		a=a*100;
		
		LoginConnection.pst.setFloat(8, a);
		LoginConnection.pst.setInt(9, tenPojo_obj4.getRoll());	
		LoginConnection.pst.executeQuery();
		LoginConnection.pst.close();    
		}
		
		catch (Exception e) {
			return "Try Again";
			
		}
		return "Insert Successfuly";
	}

}
