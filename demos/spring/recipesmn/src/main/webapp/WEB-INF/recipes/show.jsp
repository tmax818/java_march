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

            <c:choose>
                <c:when test="${recipe.user.id == userId}">
                    <p>Your recipe for ${recipe.name} is good</p>
                </c:when>
                <c:otherwise>
                    <p>${recipe.user.userName} made this recipe for ${recipe.name} it sucks!!</p>
                </c:otherwise>
            </c:choose>
            <h1> ${recipe.name} Recipe</h1>
            
            <h3>Posted by: ${recipe.user.userName}</h3>
            
            <h4>Date made</h4>
            <p>${recipe.dateMade}</p>

            <h4>Under 30 min</h4>
            <c:if test="${recipe.under30}">yes</c:if>
            <c:if test="${!recipe.under30}">no</c:if>

    </body>
    </html>