<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.services.FunctionServices" %>
<%@page import="com.controller.LoginController" %>

<!DOCTYPE html>
<html >
<head>
  <!-- Site made with Mobirise Website Builder v4.7.6, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
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
            <div class="navbar-buttons mbr-section-btn"><a class="btn btn-sm btn-primary display-4" href="http://localhost:8080/BANK/login"><span class="mbri-lock mbr-iconfont mbr-iconfont-btn"></span>
                    
                    Login</a></div>
        </div>
    </nav>
</section>

<section class="engine"><a href="https://mobirise.me/h">how to create a web page</a></section><section class="mbr-section form3 cid-qUtB8q00H1" id="form3-10">

    

    

    <div class="container">
        <div class="row justify-content-center">
            <div class="title col-12 col-lg-8">
                <h2 class="align-center pb-2 mbr-fonts-style display-2"></h2>
                <h3 class="mbr-section-subtitle align-center pb-5 mbr-light mbr-fonts-style display-4"><strong><em>
                    Search Result Here</em></strong></h3>
            </div>
        </div>

         <div class="row py-2 justify-content-center">
            <div class="col-12 col-lg-6  col-md-8 ">
                <form class="mbr-form" action="http://localhost:8080/BANK/Search" method="post" data-form-title="Mobirise Form"><input type="hidden" name="email" data-form-email="true" value="dtONgdVMWLgav0drti3QRUpMPfukwU23nsyDfGfHhDOCmAW9lqj17mPsVhlYXXOkLI34pED0iHlqe1b/rb0bb1iR3B2StTebva140Hr3YTf0X9s1YF2ThqH9rgN8Qw6G" data-form-field="Email">
                    <div class="mbr-subscribe input-group">
                        <input class="form-control" type="text" name="s_roll" placeholder="Search Roll Now" data-form-field="Email" required="" id="email-form3-c">
                        <span class="input-group-btn"><button href="" type="submit" class="btn btn-primary display-4">SUBMIT</button></span>
                    </div>
                </form>
            </div>
        </div>
    </div>
         
        

    <br><br><br>
    <h6  align="center" style="color: red;font-size:20px;" >${che} </h6>
    <br><br><br>
    
    <%
   
    HttpSession sessions=request.getSession();
  	String aa = (String) sessions.getValue("no");
  	
    if(request.getParameter("s_roll")==null || aa=="nahe"  )
    {
    	sessions.removeAttribute("no");
    %>
    	   <form action="http://localhost:8080/hjg"  method="post">
   	   	<table border="1" cellpadding="10%" align="Center">
   	   			<tr>
   	   			    <th>Name</th>
   	   			    <th>SUBJECT1</th>
   	   			    <th>SUBJECT2</th>
   	   			    <th>SUBJECT3</th>
   	   			    <th>SUBJECT4</th>
   	   			    <th>SUBJECT5</th>
   	   			    <th>Obtained Marks</th>
   	   			    <th>Total</th>
   	   			    <th>Percentage</th>
   	   			    <th>Pass / Fail</th>
   	   			</tr>				
   	             <tr>
   	                 <td>----- </td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 <td>-----</td>
   	                 
   	                 
   	             </tr>
   	       </table> 
   	   </form>
    <%}
    else
    {
    	sessions.removeAttribute("no");
    %>	
    
    <form action="http://localhost:8080/hjg"  method="post">
  	<table border="1" cellpadding="10%" align="Center">
  			<tr>
  			    <th>Name</th>
  			    <th>${s_list.get(15)}</th>
  			    <th>${s_list.get(13)}</th>
  			    <th>${s_list.get(14)}</th>
  			    <th>${s_list.get(16)}</th>
  			    <th>${s_list.get(17)}</th>
  			    <th>Obtained Marks</th>
  			    <th>Total</th>
  			    <th>Percentage</th>
  			    <th>Pass / Fail</th>
  			</tr>				
            <tr>
                <td>${s_list.get(1)}</td>
                <td>${s_list.get(2)}</td>
                <td>${s_list.get(3)}</td>
                <td>${s_list.get(4)}</td>
                <td>${s_list.get(5)}</td>
                <td>${s_list.get(6)}</td>
                <td>${s_list.get(8)}</td>
                <td>${s_list.get(9)}</td>
                <td>${s_list.get(10)}</td>
                <td style="color: red">${s_list.get(12)}</td>
                
                
            </tr>
      </table> 
  </form>
    <% }
    %>

</section>


  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/popper/popper.min.js"></script>
  <script src="assets/tether/tether.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smoothscroll/smooth-scroll.js"></script>
  <script src="assets/dropdown/js/script.min.js"></script>
  <script src="assets/touchswipe/jquery.touch-swipe.min.js"></script>
  <script src="assets/theme/js/script.js"></script>
  <script src="assets/formoid/formoid.min.js"></script>
   
</body>
</html>



<!-- <div class="row py-2 justify-content-center"> -->
<!--             <div class="col-12 col-lg-6  col-md-8 "> -->
<!--                 <form class="mbr-form" action="http://localhost:8080/BANK/InsertTenClass" method="post" data-form-title="Mobirise Form"><input type="hidden" name="email" data-form-email="true" value="dtONgdVMWLgav0drti3QRUpMPfukwU23nsyDfGfHhDOCmAW9lqj17mPsVhlYXXOkLI34pED0iHlqe1b/rb0bb1iR3B2StTebva140Hr3YTf0X9s1YF2ThqH9rgN8Qw6G" data-form-field="Email"> -->
<!--                     <div class="mbr-subscribe input-group"> -->
<!--                         <input class="form-control" type="email" name="email" placeholder="Email" data-form-field="Email" required="" id="email-form3-c"> -->
<!--                         <span class="input-group-btn"><button href="" type="submit" class="btn btn-primary display-4">SUBSCRIBE</button></span> -->
<!--                     </div> -->
<!--                 </form> -->
<!--                 </div> 
   <td>${s_list.get(0)}</td>
                <td>${s_list.get(1)}</td>
                <td>${s_list.get(2)}</td>
                <td>${s_list.get(3)}</td>-->
<!--             </div> -->