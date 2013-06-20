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
		<p>
			Bienvenue sur Geektic, le site de rencontres!<br/>
			Avec une interface graphique extra épurée!
		</p>
		<a href="list">Lister tous les geeks</a><br/>
		
		<br/>
		<form method=post action="list">
			Rechercher un Geek:<br/>
			<ul>
				<li>
					Dont la catégorie 
					<select name="category">
						<option value="pseudo">Pseudo</option>
						<option value="nom">Nom</option>
						<option value="mail">Adresse mail</option>
						<option value="interets">Intérêts</option>
					</select>
					ressemble à 
					<input type=text name="value"/><br/>
				</li>
				<li>
					Qui est:
					<input type="radio" name="sex" value="male"/>Un homme
					&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="female"/>Une femme
					&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="sex" value="both" checked/>Pas une carte mère
				</li>
			</ul>
			<br/><input type="submit" value="Rechercher"/>
		</form>
	</body>
</html>