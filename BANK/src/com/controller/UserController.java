package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pojo.NinePojo;
import com.pojo.StudentPojo;
import com.pojo.TenPojo;
import com.services.FunctionServices;
import com.services.LoginServices;

@Controller
@RequestMapping(value="/User")
public class UserController 
{
	
	@Autowired
	FunctionServices functionservice_obj1;
	
	@Autowired
	LoginServices loginservices_obj6;
	
	
		@RequestMapping(value="/Edit/{R}")
		public String send_roll(@PathVariable(value="R") int Roll,HttpServletRequest request,HttpServletResponse response,HttpSession sessions,Model m)
		{
			if(loginservices_obj6.cheack_login_valid(request,sessions,m).equals("Login"))
			{
			   return "redirect:/login";
			}
		sessions.setAttribute("sessionValue", Roll); 
		return "EditStudentRecord";
		}

		
		@RequestMapping(value="/Edit",method=RequestMethod.POST)
		public String edit_single_student(@ModelAttribute("msg")NinePojo ninepojo_obj3,TenPojo tenpojo_obj3,StudentPojo studentpojo_obj3,BindingResult bindresult,Model model,HttpServletRequest request,HttpServletResponse response,HttpSession sessions)
		{
			try {	   
			if(bindresult.hasErrors())
			{
				model.addAttribute("Cheacks", "Binding Error");
		
			}
			
			if(loginservices_obj6.cheack_login_valid(request,sessions,model).equals("Login"))
			{
			   return "redirect:/login";
			}
			model.addAttribute("Cheacks", functionservice_obj1.edit_student_name_final(studentpojo_obj3,ninepojo_obj3,tenpojo_obj3));
			
			} catch (Exception e) { 
			}
		return "EditStudentRecord";    
		}	
}
