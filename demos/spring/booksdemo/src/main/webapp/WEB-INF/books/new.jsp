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
    <meta charset="UTF-8">
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->

</head>
<body>
    ${book}
    <div class="container">

        <h1>Create a Book</h1>
        
        
        <form class="form-control" action="/books" method="POST">
            <div class="form-control">
                title: <input type="text" name="title" id="">
                author: <input type="text" name="author" id="">
                pages: <input type="text" name="pages" id="">
            </div>
            
            <input type="submit" value="create">
        </form>
        
        <h2>New and improved form</h2>

        <form:form action="/books" method="post" modelAttribute="book">
        <div class="form-control">
            <form:label path="title">title</form:label>
            <form:errors path="title" />
            <form:input path="title"></form:input>
        </div>
        <div class="form-control">
            <form:label path="author">author</form:label>
            <form:errors path="author" />
            <form:input path="author"></form:input>
        </div>
        <div class="form-control">
            <form:label path="pages">pages</form:label>
            <form:errors path="pages" />
            <form:input path="pages"></form:input>
        </div>
        <input type="submit" value="submit">
        </form:form>

        <a class="btn btn-primary" href="/">home</a>
    </div>

</body>
</html>