<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<%@page import="com.dbo.LoginConnection" %>
<%@page import="com.controller.UserController" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1 style="color: red" align="center">Edit Student Data</h1>
<h4  align="center" style="color: red">${Cheacks}</h4>
<form name="forms" action="/BANK/User/Edit"  method="POST" >
<%--                 <h6  align="center" style="color: red">${getroll} </h6> --%>
  	<table border="1" cellpadding="10%" align="Center" style="border-color: orange; border-radius: 5ex; box-shadow: 1ex;">
  				
  				<%

  				HttpSession sessions=request.getSession();
  				int aa = (int) sessions.getValue("sessionValue");
			
  				 LoginConnection loginconnection_obj3=new LoginConnection();
  				loginconnection_obj3.create_Connection();        
  	   LoginConnection.pst=LoginConnection.con.prepareStatement("select ROLL,NAME,FATHERNAME,CLASS,SECTION,CONTACT,COM_BIO,SUBJECT1,SUBJECT2,SUBJECT3,SUBJECT4,SUBJECT5 from student where ROLL=?");
  	 LoginConnection.pst.setInt(1, aa);
  	   LoginConnection.rs =  LoginConnection.pst.executeQuery();
  	   while(LoginConnection.rs.next())
  	   {
  	  			%>
        <tr>
         <td>Roll :</td>
         <td><input type="text" name="roll" value="<%=LoginConnection.rs.getString(1) %>"></td>
        </tr>
        <tr>
         <td>Name</td>
         <td><input type="text" name="name" value="<%=LoginConnection.rs.getString(2) %>"></td>
        </tr>
        <tr>
         <td>Father Name</td>
         <td><input type="text" name="fathername" value="<%=LoginConnection.rs.getString(3) %>"></td>
        </tr>
        <tr> 
          <td>Class</td>
          <td><input type="text" name="classs" value="<%=LoginConnection.rs.getString(4) %>"></td>
        </tr>       
        <tr>
            <td>Section</td>
            <td><input type="text" name="section" value="<%=LoginConnection.rs.getString(5) %>"></td>
        </tr>
        <tr>  
            <td>Contact</td>
            <td><input type="text" name="contact" value="<%=LoginConnection.rs.getString(6) %>"></td>
        </tr>
     <% 
 		if(LoginConnection.rs.getString(4).equals("9")) 
 		{
 		   %>
 		<tr> 
            <td>Field</td>
            <td>
            <input id="Com" type="radio" name="check_com_bio" value="Com"<% if(LoginConnection.rs.getString(7).equals("Com") ){ out.print(" checked"); }%>><label for="Com">Computer</label>
            <input id="Bio" type="radio" name="check_com_bio" value="Bio" <% if(LoginConnection.rs.getString(7).equals("Bio") ){ out.print("checked"); }%> ><label for="Bio">Biology</label></td>
        </tr>  
        <%} %>
        <tr>
            <td>English</td>
            <td><input type="text" name="english" value="<%=LoginConnection.rs.getString(8) %>"></td>
        </tr>
         <% 
 		if(LoginConnection.rs.getString(4).equals("9")) 
 		{
 		   %> 
 		<tr>
            <td>Sindhi</td>
            <td><input type="text" name="sindhi" value="<%=LoginConnection.rs.getString(9) %>"></td>
        </tr>
        <tr>
            <td>Com / Bio</td>
            <td><input type="text" name="computer_biology" value="<%=LoginConnection.rs.getString(10) %>"></td>
        </tr> <% 
 		}
 		else
 		{
 		   %>	
 		<tr>
            <td>Urdu</td>
            <td><input type="text" name="urdu" value="<%=LoginConnection.rs.getString(9) %>"></td>
        </tr>
        <tr>
            <td>Islamiat</td>
            <td><input type="text" name="islamiat" value="<%=LoginConnection.rs.getString(10) %>"></td>
        </tr>  
 		  <%  }  %>
 	 
        <tr>
            <td>Physics</td>
            <td><input type="text" name="physics" value="<%=LoginConnection.rs.getString(11) %>"></td>
        </tr>
        <tr>
            <td>Math</td>
            <td><input type="text" name="math" value="<%=LoginConnection.rs.getString(12) %>"></td>
        </tr>
        <tr>
        <%} %>
         <td></td>
         <td><input type="submit"  value="Submit"></td>
        </tr>
  	</table> 
  </form>  
</body>
</html>
