<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/css/stylebutton.css" />
<title>Form Login</title>
</head>
<body>
	<div
		style="width: 500px; margin: 50px auto; background: #D0D01A; padding: 30px">
		<h2>Admin management</h2>
		<%
			if (session != null && session.getAttribute("username") != null) {
		%>
		<h2>
			Username :<strong><%=session.getAttribute("username")%></strong>
		</h2>
		<%
			}
		%>
		<ul>
			<li><a href="Logout" class="round green">Logout<span class="round">This is Logout Button.</span></a></li>
			<li><a href="changepassword.jsp" class="round red">Change<br>PassW<span class="round">Click on to change your password. </span></a></li>
		</ul>
	</div>
</body>
</html>