<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Geektic</title>
	</head>
	<body>
		<p>Hello world!</p>
		<p>
			<c:out value="${geekNumero1.id}"/><br/>
			<c:out value="${geekNumero1.pseudo}"/><br/>
			<c:out value="${geekNumero1.male}"/><br/>
			<a href="list">Lister les geeks</a>
		</p>
	</body>
</html>