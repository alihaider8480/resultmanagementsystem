<%@page import="java.io.PrintWriter"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.dbo.LoginConnection" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >
<head>
 <!-- Site made with Mobirise Website Builder v4.7.6, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="generator" content="Mobirise v4.7.6, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1">
  <link rel="shortcut icon" href="assets/images/bank-1-124x70.jpg" type="image/x-icon">
  <meta name="description" content="Site Creator Description">
  <title>Page 5</title>
  <link rel="stylesheet" href="assets/web/assets/mobirise-icons/mobirise-icons.css">
  <link rel="stylesheet" href="assets/tether/tether.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap-reboot.min.css">
  <link rel="stylesheet" href="assets/dropdown/css/style.css">
  <link rel="stylesheet" href="assets/theme/css/style.css">
  <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
  
  <style type="text/css">
  		 table#t01 {
       
    background-color: #f1f1c1;
}
  </style>
  
</head>
<body>
<section class="menu cid-qUtB8plKso" once="menu" id="menu1-z">

    

    <nav class="navbar navbar-expand beta-menu navbar-dropdown align-items-center navbar-fixed-top navbar-toggleable-sm">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <div class="hamburger">
                <span></span>
                <span></span>
                <span></span>
                <span></span>
            </div>
        </button>
        <div class="menu-logo">
            <div class="navbar-brand">
                
                
            </div>
        </div>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav nav-dropdown navbar-nav-top-padding" data-app-modern-menu="true"><li class="nav-item dropdown">
                    <a class="nav-link link text-primary display-7" href="https://mobirise.com" aria-expanded="false"></a>
                </li><li class="nav-item dropdown"><a class="nav-link link text-primary display-7" href="https://mobirise.com">
                        </a></li>
                <li class="nav-item">
                    <a class="nav-link link text-primary display-7" href="https://mobirise.com">
                        </a>
                </li> 
                       
                        </a></li><li class="nav-item"><a class="nav-link link text-primary display-4" href="http://localhost:8080/BANK/" aria-expanded="true"><span class="mbri-home mbr-iconfont mbr-iconfont-btn" style="font-size: 30px;">Home</span>
                        </a></li><li class="nav-item"><a class="nav-link link text-primary display-7" href="http://localhost:8080/BANK/CreateResults" aria-expanded="true"><span class="mbri-edit mbr-iconfont mbr-iconfont-btn">Create Result</span>
                        </a></li><li class="nav-item"><a class="nav-link link text-primary display-7" href="http://localhost:8080/BANK/ShowResults" aria-expanded="true"><span class="mbri-user mbr-iconfont mbr-iconfont-btn">Show All</span>
                        </a></li><li class="nav-item"><a class="nav-link link text-primary display-7" href="http://localhost:8080/BANK/About" aria-expanded="true"><span class="mbri-search mbr-iconfont mbr-iconfont-btn">About</span>
                        </a></li><li class="nav-item"><a class="nav-link link text-primary display-7" href="http://localhost:8080/BANK/Contact" aria-expanded="true"><span class="mbri-mobile mbr-iconfont mbr-iconfont-btn">Contact</span>
                        </a></li></ul>
            <div class="navbar-buttons mbr-section-btn"><a class="btn btn-sm btn-primary display-4" href="http://localhost:8080/BANK/logout"><span class="mbri-lock mbr-iconfont mbr-iconfont-btn"></span>
                    
                    Logout</a></div>
        </div>
    </nav>
</section>

    <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/popper/popper.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smoothscroll/smooth-scroll.js"></script>
  <script src="assets/dropdown/js/script.min.js"></script>
  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/formoid/formoid.min.js"></script>0
  
<h3 align="center"><br><br><br><a href="/BANK/ShowResults?C=9">9th class </a>/<a href="/BANK/ShowResults?C=10"> 10th class</a></h3>
<h1 align="center"><br><br><br>Show <% 
 			                            if(request.getParameter("C")==null) 
 										{
 											out.print("9");
 										}
 										else
 											{
 													out.print(request.getParameter("C"));
 											}
 				                     %>th Class Student Records<br><br></h1>
 				                     <h3 align="center">Total Marks = 450</h3>
 <form method="post" >
                <h6  align="center" style="color: red">${error} </h6>
      
     
                
  	<table id="t01" border="1" cellpadding="10%" align="Center" >
  			<tr>
  			<td>Roll #</td>	
  			<td>NAME</td>
  			<td>Father Name</td>
  			<td>Section</td>
  			<td>Contact</td>
  			<td>English</td>
  	         
  	         <% 
 			                            if(request.getParameter("C")==null || request.getParameter("C").equals("9")) 
 										{
 			                              %> <td>Sindhi</td> 	
 			                                 <td>Com / Bio</td> <% 
 										}
 										else
 											{
 											 %>	<td>Urdu</td>
 									     		<td>Islamiat</td>   <% 
 											}
 				                     %>
  	         
			
  			<td>Physics</td>
  			<td>Math</td>
  			<td>Gain Marks</td>
  			<td>Percentage</td>
  			<td>Pass / Fail</td>
  			<td>Edit / Delete</td>
  			
  			
            </tr>
            
               	<% 
  	    
  	     LoginConnection loginconnection_obj3=new LoginConnection();
  	String f_c =request.getParameter("C");
  	if(f_c==null)
  	{
  		f_c="9";
  	}
  	 
    	loginconnection_obj3.create_Connection();   
  	   LoginConnection.pst=LoginConnection.con.prepareStatement("SELECT ROLL,NAME,FATHERNAME,SECTION,CONTACT,SUBJECT1,SUBJECT2,COM_BIO,SUBJECT3,SUBJECT4,SUBJECT5,GAIN,PERCENTAGE FROM student WHERE CLASS = "+f_c+"");
  	   LoginConnection.rs =  LoginConnection.pst.executeQuery();
  	   while(LoginConnection.rs.next())
  	    {
  	%>	 <tr>
           <td>${LoginConnection.rs.getString(1)}</td>
           <td>${LoginConnection.rs.getString(2)}</td>
           <td>${LoginConnection.rs.getString(3)}</td>
           <td>${LoginConnection.rs.getString(4)}</td>
           <td>${LoginConnection.rs.getString(5)}</td>
           <td>${LoginConnection.rs.getString(6)}</td>
           <td>${LoginConnection.rs.getString(7)} </td>      
           <td><% if(request.getParameter("C")==null || request.getParameter("C").equals("9") ) 
 										{
  	        	                           out.print(LoginConnection.rs.getString(8)+":");
 										} 
 			                              %> ${LoginConnection.rs.getString(9)}</td>
           <td>${LoginConnection.rs.getString(10)}</td>
           <td>${LoginConnection.rs.getString(11)}</td>
           <td>${LoginConnection.rs.getString(12)}</td>
           <td>${LoginConnection.rs.getString(13)}</td>
           <%
              Float a= Float.parseFloat(LoginConnection.rs.getString(13));
         
               if(a>=49)
        	   {
        	   %> <td> Pass</td>  <% 
        	   }
               else
               {
            	   %> <td style="color: red"> Fail</td>  <%
               }
        	   %>
        	   <%
        	   
        	   if(request.getParameter("C")==null || request.getParameter("C").equals("9"))
        	   {
        		   f_c = "9";
        	   }
        	   else
        	   {
        		   f_c = "10";
        	   }
        	   %>
        	   <td><a href="/BANK/User/Edit/${LoginConnection.rs.getString(1)}" target="_blank">Edit</a> : <a href="/BANK/delete_student/<%=LoginConnection.rs.getString(1)%>/<%=f_c%>">delete </a></td>
        </tr>        
            
       <% 
        }
        %>	
        
  	</table> 
  </form>
  <br><br>
</body>
</html>