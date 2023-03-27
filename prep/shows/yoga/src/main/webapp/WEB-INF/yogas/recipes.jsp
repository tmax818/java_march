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
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->

    <title>recipes</title>
</head>
<body>
    <h1>All recipes</h1>
    
    <table class="table">
        <thead>
            <th>Vote</th>
            <th>Name</th>
            <th>Posted By</th>
            <th>Actions</th>
            <th>Votes</th>
        </thead>
        <tbody>
            <c:forEach var="recipe" items="${recipes}">
            <tr>
                <td>
                <c:if test="${userId != recipe.user.id}">
                    <a href="/recipes/vote/${recipe.id}">vote</a>
                </c:if>
                </td>
                <td>${recipe.name}</td>
                <td>${recipe.user.userName}</td>
                <td>
                    <a href="/recipes/${recipe.id}">view</a>
                    <!-- if the recipe.user_id equals the logged in user's id  -->
                    <c:if test="${recipe.user.id == userId}">
                        <a href="/recipes/edit/${recipe.id}">edit</a>
                        <form action="/recipes/delete/${recipe.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete">
                        </form>
                    </c:if>
                    
                </td>
                <td>${recipe.users.size()}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/recipes/new">add recipe</a>
    <a href="/logout">logout</a>
    
</body>
</html>