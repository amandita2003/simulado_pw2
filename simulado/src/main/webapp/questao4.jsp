<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String n = request.getParameter("numero");

int numero = Integer.parseInt(n);
out.print("o dobro de: "+n+"é: "+numero*2);
%>
</body>
</html>