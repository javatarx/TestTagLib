<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String[] numeros = request.getParameterValues("numeros");
	for(int i=0; i<numeros.length;i++){
		out.println("se selecciono a :"+numeros[i]);
	}
%>

</body>
</html>