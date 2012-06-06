<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@taglib prefix="onepiece" uri="/WEB-INF/tag/onepice.tld" %>
<html>
<body>
<%
	List<String> lista = new ArrayList<String>();
	lista.add(new String("Uno"));
	lista.add(new String("Dos"));
	lista.add(new String("Tres"));
	lista.add(new String("Cuatro"));
%>
<onepiece:lista lista="<%=lista%>"></onepiece:lista>
</body>
</html>
