package com.interfaces;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.pojo.LoginPojo;

public interface LoginInterface 
{
	public boolean login(LoginPojo loginpojo_obj4) throws SQLException;
	public String cheack_login_valid(HttpServletRequest request,HttpSession sessions,Model model) ;	
}
