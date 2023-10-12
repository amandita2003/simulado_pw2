<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String mes = request.getParameter("mes");
int numero = Integer.parseInt(mes);
if(numero==12){
out.print("mês: "+mes +"<br> falta pouco para o ano novo");
}
else{
out.print("mês: "+mes);
}
%>
</body>
</html>