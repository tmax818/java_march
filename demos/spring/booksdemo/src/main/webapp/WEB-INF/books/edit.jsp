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
    ${results}
    <div class="container">
        
        <h2>Edit book</h2>

        <form:form action="/books/${book.id}" method="post" modelAttribute="book">
            <input type="hidden" name="_method" value="put">
        <div class="form-control">
            <form:label path="title">title</form:label>
            <form:errors path="title" />
            <form:input path="title" value="${ebook.title}"></form:input>
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