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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form:form action="/recipes" method="post" modelAttribute="recipe">
        <form:input type="hidden" path="user" value="${userId}"></form:input>
        <div class="form-control">
            <form:label path="name">Name</form:label>
            <form:errors path="name"></form:errors>
            <form:input path="name"></form:input>
        </div>
        <div class="form-control">
            <form:label path="dateMade">dateMade</form:label>
            <form:input type="date" path="dateMade"></form:input>
        </div>
        <div class="form-control">
            <form:label path="under30">under30</form:label>
            <form:errors path="under30"></form:errors>
            <form:select path="under30">
                <form:option value="false">no</form:option>
                <form:option value="true">yes</form:option>
            </form:select>
        </div>
        
        <input type="submit" value="create recipe">
    </form:form>
</body>
</html>