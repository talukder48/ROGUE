<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@page import="Rogue.RogueServlet"%>
<link rel="stylesheet" href="styles.css">
</head>
<script type="text/javascript">


</script>
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
 	<td><button>Press Me</button> </td>
 	</tr>
 		
 	</table>
            	
 </form>
 </div>
 
<div id='mf'>
</div>



</body>
</html>