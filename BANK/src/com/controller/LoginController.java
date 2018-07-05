package com.controller;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;

import com.pojo.ContactPojo;
import com.pojo.LoginPojo;
import com.pojo.NinePojo;
import com.pojo.StudentPojo;
import com.pojo.TenPojo;
import com.services.ContactService;
import com.services.FunctionServices;
import com.services.LoginServices;
import com.services.NineService;
import com.services.StudentInformationService;
import com.services.TenService;

//@ComponentScan(basePackages={"com.*"})
//@ComponentScans(basePackage="com.controller", value = { @ComponentScan })
//@EnableWebMvc

@Controller
public class LoginController 
{
	 @Autowired
	 private LoginServices loginservices_obj;	
	 
	 @Autowired
	 private StudentInformationService studentinformationservice_obj;
	
	 @Autowired
	 private NineService nineservice_obj;
	 
	 @Autowired
	 private TenService tenservice_obj;
	 
	 @Autowired
	 private FunctionServices functionservices_obj;
	 
	 @Autowired
	ContactService contactservice_obj1;
	 
	 HttpSession session1;
	 public List<String> lists = new ArrayList<String>();
	 
	 
	 
	 @RequestMapping(value="/")
		public String fun()
		{		
		 
			return "HomePage";
		}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String home(@ModelAttribute("msg") LoginPojo login_obj4,BindingResult bind_obj1,Model m,HttpServletRequest req,
			HttpServletResponse res,HttpSession session) throws SQLException 
	{
		if(bind_obj1.hasErrors()) 
		  {
			  
		      if(bind_obj1.toString().indexOf("NumberFormatException")>=0)
		      {
		    	  m.addAttribute("login_error","Don't Use Alphabat In Password Field.Remember Is Password Type Is Number ");
		      } 
			  return "Login";
		  }		  
		else
		  {
			 
			    boolean cheack;
		        cheack =  loginservices_obj.login(login_obj4);     
		        if(cheack==false)
		        {
		        	m.addAttribute("login_error","Invalid user Name And Password");
		        	return "Login";
		        }	
		        session=req.getSession();
		        session.setAttribute("session_name", login_obj4.getName());
		        session.setAttribute("session_spassword", login_obj4.getPassword());
		  }				
		return "HomePage"; 
	}
	@RequestMapping(value="/login" , method=RequestMethod.GET)
    public String login_randum(HttpServletRequest request,HttpSession sessions,Model model) 
    {
		
		if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
		{
		return "Login";
		}
			return "Login";
	          
     }	
	@RequestMapping(value="/logout")
	public String logout_user(HttpSession session,HttpServletRequest req)
	{
		session = req.getSession();
        session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping(value="/CreateResults")	
	public String createresult(HttpServletRequest request,HttpSession sessions,Model model)
	{
		   if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
			{
			return "Login";
			}
		return "CreateResult";
			
	}
	
	@RequestMapping(value="/InsertStudents")	
	public String createstudent(HttpServletRequest request,HttpSession sessions,Model model)
	{
		if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
		{
		return "Login";
		}
		return "InsertStudent";
			
	}
	
	@RequestMapping(value="/InsertNineClass")	
	public String insert_nine_class_record(HttpServletRequest request,HttpSession sessions,Model model)
	{
		if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
		{
		return "Login";
		}
		return "9Class";
			
	}
	
	@RequestMapping(value="/InsertTenClass")	
	public String insert_ten_class_record(HttpServletRequest request,HttpSession sessions,Model model)
	{
		
		if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
		{
		return "Login";
		}
		return "10Class";
			
	}

    @RequestMapping(value="/Insert_Student_Information",method=RequestMethod.POST)
    public String student_information_insert(@ModelAttribute("info") StudentPojo studentpojo_obj,BindingResult bind_obj2,Model model,HttpServletRequest request,
			HttpServletResponse response,HttpSession sessions) throws SQLException  
    {
    	
   
    	 if(bind_obj2.hasErrors())
		  {
		      if(bind_obj2.toString().indexOf("NumberFormatException")>=0)
		      {
		    	  model.addAttribute("error","Don't Use Alphabat In Roll Field.Remember Is Roll Number Type Is Number ");
		      } 
			  return "/InsertStudent";
		  }		  
		else
		  {
			if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
			{
			return "Login";
			}
	    	String a=	studentinformationservice_obj.student_information(studentpojo_obj);
	    	model.addAttribute("error",a);
	    	
		  }	
    	 
    	
		return "/InsertStudent";
  }
    
    @RequestMapping(value="/Insert_Nine_Class_Result")
	public String nine_insert(@ModelAttribute("nine_result") NinePojo ninepojo_obj,BindingResult bind_obj3,Model model,HttpServletRequest request,
			HttpServletResponse response,HttpSession sessions) throws SQLException
	{
    	 if(bind_obj3.hasErrors())
		  {
		      if(bind_obj3.toString().indexOf("NumberFormatException")>=0)
		      {
		    	  model.addAttribute("cheack","Don't Use Alphabat In Text Field.Remember Is All Field Type Is Number ");
		      } 
			  return "9Class"; 
		  }		  
		else 
		  {
			if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
			{
			return "Login";
			}
			else
			{
				String aa =nineservice_obj.nine_result_insert(ninepojo_obj);
				model.addAttribute("cheack", aa);
			}
		  }		
		return "9Class";
	}
	
    @RequestMapping(value="/Insert_ten_Class_Result")
   	public String nine_ten(@ModelAttribute("ten_result") TenPojo tenpojo_obj4,BindingResult bind_obj3,Model model,HttpServletRequest request,
   			HttpServletResponse response,HttpSession sessions) throws SQLException
   	{
       	 if(bind_obj3.hasErrors())
   		  {
   		      if(bind_obj3.toString().indexOf("NumberFormatException")>=0)
   		      {
   		    	  model.addAttribute("cheack","Don't Use Alphabat In Text Field.Remember Is All Field Type Is Number ");
   		      } 
   			  return "9Class"; 
   		  }		  
   		else
   		  {
   			if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
   			{
   			return "Login";
   			}
   			else
   			{
   				String aa = tenservice_obj.ten_result_insert(tenpojo_obj4) ;
   				model.addAttribute("cheack", aa);
   			}
   		  }		
   		return "10Class";
   	}
    
    @RequestMapping(value={"/ShowResults","/ShowResults/{C}"})
    public String show_result(@RequestParam(value = "C", required = false, defaultValue = "9") String C,HttpServletRequest request,
			HttpServletResponse response,HttpSession sessions,Model model)
    {
    	if(loginservices_obj.cheack_login_valid(request,sessions,model).equals("Login"))
		{
		return "Login";
		}
    	else if(C=="9") 
    	{
    		model.addAttribute("single", C);
    	} 
    	else if(C=="10")
    	{
    		model.addAttribute("single", C);
    	}
    	return "ShowResult";
    }    
    
	@RequestMapping(value="/delete_student/{D}/{V}")
	public String pass_fails(@PathVariable Map<String, String> vars,HttpServletRequest request,HttpServletResponse response,Model m) 
	{
		
		functionservices_obj.pass_fail(vars.get("D"));
		if(vars.get("V").equals("9") || vars.get("V")==null)
		{
			return "redirect:/ShowResults?C=9";	
		}
		
		return "redirect:/ShowResults?C=10";
	}
	
	@RequestMapping(value="/Search",method=RequestMethod.POST)
	public String search_student_result(HttpServletRequest request,HttpServletResponse response,Model model)
	{			session1 = request.getSession();
		
		try
		{
		
		lists =  functionservices_obj.search_student(request.getParameter("s_roll"));
		
		if(lists.get(0).equals("p"))
		{
			session1.setAttribute("no", "nahe");
			model.addAttribute("che", "Not Found");
			return "HomePage";
		}
		else
		{ 
			
			if(Float.parseFloat(lists.get(10).toString()) > 40)			
	     	{
			lists.add("Pass");
		    }
		    else
		    {
			lists.add("Fail");
		    }
		    if(lists.get(11).equals("9"))
		    {
			lists.add("Sindhi");
			lists.add("Com/Bio");
			}
		    else
		    {
			lists.add("Urdu");
			lists.add("Islamiat");
			
		    }
		    lists.add("English");
		    lists.add("Physic");
		    lists.add("Math");
	        model.addAttribute("s_list", lists);
		}
		
		}
		catch (Exception e) {
			System.out.println("e1"+e);
		}
		return "HomePage";    
	}

	@RequestMapping(value="/Contact")
	public String contact()
	{
		return "Contact";
	}
	
	
	@RequestMapping(value="/About")
	public String about()
	{
		return "About";
	}
	@RequestMapping(value="/ContactUser" ,method=RequestMethod.POST)
	public String contacts(ContactPojo contactpojo_obj1,BindingResult bindresult,Model model)
	{
		if(bindresult.hasErrors())
		{
			model.addAttribute("Cheacks", "Binding Error");
	
		}
		model.addAttribute("send", contactservice_obj1.usercontact(contactpojo_obj1));
		return "Contact";
	}
}