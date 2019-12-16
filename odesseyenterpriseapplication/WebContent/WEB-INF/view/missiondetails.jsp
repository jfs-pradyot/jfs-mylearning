<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>missiondetails</title>
</head>
<body>
<h1>Here are your mission details</h1>
<c:forEach var="tempCustomer" items="${missionDetailList}">

${tempCustomer}
</c:forEach>
</body>
</html>