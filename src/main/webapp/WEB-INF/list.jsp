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
			<c:if test="${!empty category}">
				Recherche de profil par ${category} 
				contenant <c:out value="' ${value} '"/> 
				et étant ${sex}.
			</c:if>
		</p>
		<ul>
			<c:forEach var="geek" items="${geeks}">
				<li><c:out value="<li>"></c:out>
					<a href="profile?id=${geek.id}">
					<c:out value="${geek.pseudo}"/>
					<c:out value=" (${geek.prenom} ${geek.nom})"/>
					</a>
				</li>
			</c:forEach>
		</ul>
		<c:if test="${empty geeks}">
			<p>
				Aucun profil correspondant trouvé.
			</p>
		</c:if>
		<a href="/Geektic"><c:out value="<a>"></c:out>Accueil</a>
	</body>
</html>