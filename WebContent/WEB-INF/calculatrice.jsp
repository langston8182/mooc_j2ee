<%@page import="com.calculatrice.beans.Resultat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculatrice</title>
</head>
<body>
<%
	Resultat resultat = (Resultat) request.getAttribute("resultat");
	String error = (String) request.getAttribute("error");
	if (resultat != null && error.isEmpty()) {
%>
Le résultat de l'opération ${resultat.operande1 } ${resultat.operation.getValue() } ${resultat.operande2 } est ${resultat.resultat }
<%
	} else if (resultat != null && !error.isEmpty()) {
%>
	Error : Impossible de diviser par 0.
<%
	}
%>
<form method="POST" action="#">
	<input type="number" name="operande1" />&nbsp;
	<select name="operation" size="1">
		<option value="addition">+</option>
		<option value="soustraction">-</option>
		<option value="multiplication">*</option>
		<option value="division">/</option>
	</select>
	&nbsp;<input type="number" name="operande2" /> = <input type="submit" value="Envoyer" />
</form>
</body>
</html>