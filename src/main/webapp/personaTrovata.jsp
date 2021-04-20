<%@page import="it.prova.riconoscimento.model.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Persona trovata</title>
</head>
<body>
	<% Persona personaInPagina = (Persona) request.getAttribute("esito_attribute"); %> 
	nome : <%=personaInPagina.getNome() %>
	cognome : <%=personaInPagina.getCognome() %>
	Persona trovata!

</body>
</html>