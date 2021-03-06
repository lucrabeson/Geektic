<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Profil de <c:out value="${geek.pseudo}" /></title>
	</head>
	<body>
		<p>
			<c:choose>
				<c:when test="${!empty geek}">
				
					Profil n°<c:out value="${geek.id}" /><br/>
					<c:out value="${geek.prenom} ${geek.nom}" /><br/>
					Pseudo: <c:out value="${geek.pseudo}" /><br/>
					<c:out value="${geek.male ? 'Homme' : 'Femme'}" /><br/>
					Mail: <a href="mailto:<c:out value="${geek.mail}" />"><c:out value="${geek.mail}" /></a><br/>
					<br/>Intérêts:
					<ul>
					<c:forEach var="interet" items="${geek.interetList}">
						<li><c:out value="<li>${interet.nom}"/></li>
					</c:forEach>
					</ul>
			
				</c:when>
				<c:otherwise>Profil non trouvé.</c:otherwise>
			</c:choose>
		</p>
		<a href="/Geektic"><c:out value="<a>"></c:out>Accueil</a>
	</body>
</html>