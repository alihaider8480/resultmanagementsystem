package com.interfaces;

import java.sql.SQLException;

import com.pojo.StudentPojo;

public interface StudentInterface 
{
	public String student_information(StudentPojo studentpojo_obj2) throws SQLException;
}
