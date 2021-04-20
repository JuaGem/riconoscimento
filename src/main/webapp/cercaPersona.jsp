<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cerca persona</title>
</head>
<body>
	
	<form action="CheckPersonaServlet" method="post">
		nome : <input type="text" name="nomeInput"> <br>
		cognome : <input type="text" name="cognomeInput"> <br>
	    <input type="submit" value="Invio">
	
	</form>

</body>
</html>