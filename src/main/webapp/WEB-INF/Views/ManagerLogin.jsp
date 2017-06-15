<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = (String) request.getAttribute("username");
		String password = (String) request.getAttribute("password");
		String message = (String) request.getAttribute("message");
		out.println(username + "," + password + "," + message);
	%>
	<form action="MGRloginDetails" method="post">
		Enter the Applicant jobId : <input type="text" name="jobid">
		<input type="submit" Value="view">
	</form>

</body>
</html>
