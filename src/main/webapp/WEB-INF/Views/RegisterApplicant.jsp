<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Java WebPage</title>
</head>
<body style="padding-left: 40px; padding-top:20px; background-color: yellow;">
	<h2 style="background-color: orange; padding: 10px; display: table; border-radius: 10px; ">Infokeys Job Application</h2>
	<form action="register" method="post" style="padding-left:28px;">
		<div style="background-color: lightgreen; display: table; padding: 10px; border-radius: 10px;">
		<table> 
		<tr>
			<td style="padding: 10px;"><label for="fname">First Name:</label></td>
			<td><input type="text" id="fname" name="firstname"></td>
		</tr>
		<tr>
			<td style="padding: 10px"><label for="lname">Last Name:</label></td>
			<td><input type="text" id="lname" name="lastname"></td>
		</tr>
		<tr>
			<td style="padding: 10px;"><label for="email">Email:</label></td>
			<td><input type="text" id="email" name="email"></td>
		</tr>
		<tr>
			<td style="padding: 10px;"><label for="phno">Phone number:</label></td>
			<td><input type="text" id="phno" name="phone"></td>
		</tr>
		<tr>
			<td style="padding: 10px;"><label for="uid">JobId:</label></td>
			<td><input type="text" id="uid" name="jobid"></td>
		</tr>
		<tr>
			<td style="padding: 10px;"><label for="resumee">Resume:</label></td>
			<td><input type="text" id="res" name="resumee"></td>
<!-- 			<td><input type="submit" value="Upload Resume"></td>
 -->		</tr>
			</table>
		<br>
		<div style="margin-left: 80px padding-bottom: 10px" >
		<input style="padding: 8px background-color: skyblue border-radius: 10px" type="submit" value="Submit Profile">
		</div>
		</div>
	</form>
	


</body>
</html>