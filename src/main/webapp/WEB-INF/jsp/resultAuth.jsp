<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="com.fomov.authorizationAndRegistration.bean.User" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="user" class="com.fomov.authorizationAndRegistration.bean.User" scope="request" />
	<h2>
		Login:
		<jsp:getProperty property="login" name="user" />
	</h2>
	
	<h2>
		Date of birthday:
		<jsp:getProperty property="dateOfBirthday" name="user" />
	</h2>
	
	<h2>
		Password:
		<jsp:getProperty property="password" name="user" />	
	</h2>
</body>
</html>