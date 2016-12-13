<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
<%@page import="Rogue.RogueServlet"%>
<link rel="stylesheet" href="styles.css">
<script type="text/javascript" src=""></script>
<script type="text/javascript">
$(document).ready(function() {                        
	                $('#submit').click(function(event) {  
	                    var username=$('#User').val();
	                 $.get('RogueServlet',{user:username},function(responseText) { 
	                        $('#welcometext').text(responseText);         
	                    });
	                });
	            });
</script>
</head>

<body>
<div id='mp'>

 </div>
 <div id='bd'> 
 <h1 >Welcome to Rogue Application </h1>
 <form method=post action="RogueServlet">
 	<table>
 	<tr> 
 		<td >User Id:</td>
 		<td><input id="User" type="text"/></td>
 	</tr>
 	
 	<tr> 
 	<td>Password</td>
 	<td><input id="Pass" type="password"/></td>
 	</tr>
 	
 	<tr> 
 	<td>Sure??</td>
 	<td><button id="submit" >Press Me</button> </td>
 	</tr>
 		
 	</table>
      	
 </form>
 </div>
 
<div id='mf'>
</div>

<div id="welcometext"></div>

</body>
</html>