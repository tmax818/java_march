<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<h1>Form Demo</h1>
<h3><c:out value="${email}"></c:out></h3>
<h4>${email}</h4>
<h5>${password}</h5>
<form action="/routetohandleformdata" method="POST">
    <label>Email:</label>
	<input type="text" name="email">
	<label>Password:</label>
	<input type="text" name="password">
	<input type="submit" value="login">
</form>

</form>
</body>
</html>