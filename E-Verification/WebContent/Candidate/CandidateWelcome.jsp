<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     
  <%@page import="com.cdac.everification.model.Candidate"%>
     <%
 	Candidate candi  = (Candidate)session.getAttribute("candi");
 
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-everification</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="beautify.css">
</head>
<body>

    <div class="container-fluid">
     <div class="row bg-primary" style="position:sticky;top:0; z-index:100;height:70px">
     
            <div class="col-12 text-light d-flex justify-content-between align-items-center">
                <div class="pl-md-5" style="font-size: 30px;font-weight: bold;font-family: 'Times New Roman', Times, serif;">E-Verification </div>
            </div>
     </div>
     
     <div class="row" style="height: 498px;">
            <div class="col-2">

            </div>
            <div class="col-8" style="border: solid 2px black; border-radius: 10px;">
                <div class="center" style="height: 200px; ">
                    <img id="imgId" src="koala.jpg" alt="Smiley face" width="200" height="150">
                </div>

                <div class="center" style="height: 100px; ">
                    <h1>Welcome <%=candi.getCandiFname()%> </h1><br/>
                </div>
                
                <div class="center" style="height: 50px;">
                    <select name="Choose Document">
                        <option value="Select Document">Select Document</option>
                        <option value="10th Marksheet">10th Marksheet</option>
                        <option value="12th Marksheet">12th Marksheet</option>
                        <option value="Graduation Marksheet">Graduation Marksheet</option>
                        <option value="Adhar Card">Adhar Card</option>
                        <option value="Pan Card">Pan Card</option>
                    </select>
                </div> 
                <div class="center" style="height: 50px;">
                    <input type="submit" value="Upload" style="border: solid 0.5px red; color: whitesmoke; 
                    border-radius: 7px; background-color: red; height: 35px; width: 100px;">
                </div>
                <div class="center" style="height: 50px;">
                    <input type="submit" value="List" style="border: solid 0.5px red; color: whitesmoke; 
                    border-radius: 7px; padding-left: 10px; background-color: red; height: 35px; width: 100px;">
                </div>  
            </div>
            <div class="col-2">
                
            </div>            
        
     </div>
    
        <footer class="w3-container bg-secondary" style="position:sticky;bottom:0;width:100%;height:80px;background:#6cf;">

            <div class="row" style="height: 30px">  
            <div class="col-4" style="color:white" >
            <h6>Contact Us:<h6>
            <div style="font-size: 15px">Email : sanketchhalke@gmail.com</div>
            <div style="font-size: 15px">Phone : 98745612310</div>
            <div style="font-size: 15px; margin-bottom:2px">Address : Kharghar</div>
            </div>
            </div>
            <div class="col-4 "></div>
            <div class="col-4"></div>
            </div>
        </footer>
    </div>
</body>
</html>