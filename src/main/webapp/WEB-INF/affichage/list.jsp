<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Liste des geeks</title>
	</head>
	<body>
		<p>
			<c:forEach var="geek" items="${geeks}">
				<c:out value="${geek.id}"/><br/>
				<c:out value="${geek.pseudo}"/><br/>
				<c:out value="${geek.male}"/><br/>
			</c:forEach>
		</p>
	</body>
</html>