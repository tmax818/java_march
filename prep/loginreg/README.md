# login and registration
- [ ] update [application.properties](./src/main/resources/application.properties)

```
# Where are jsp files? HERE!
spring.mvc.view.prefix=/WEB-INF/
# Data Persistence
spring.datasource.url=jdbc:mysql://localhost:3306/<<YOUR_SCHEMA_NAME>>
spring.datasource.username=root
spring.datasource.password=<<root or rootroot>>
spring.jpa.hibernate.ddl-auto=update
# For Update and Delete method hidden inputs
spring.mvc.hiddenmethod.filter.enabled=true
```


- [ ] dependencies in [pom.xml](pom.xml)

```xml
 <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>org.mindrot</groupId>
            <artifactId>jbcrypt</artifactId>
            <version>0.4</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
```
## Model

### persistance layer

#### Domain Models
- add [User.java](./src/main/java/tyler/loginreg/models/User.java)
- add [LoginUser.java](./src/main/java/tyler/loginreg/models/LoginUser.java)

#### repository

- add [UserRepository.java](src/main/java/tyler/loginreg/repositories/UserRepository.java)

### service layer

- add [UserService.java](src/main/java/tyler/loginreg/services/UserService.java)

## View

- [ ] add a view for login page [index.jsp](./src/main/webapp/WEB-INF/index.jsp)

```html
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
    <title>LoginReg</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<div class="container">
<h1  class="align-content-center">Login and Registration</h1>
    <div class="row">
        <div class="col">
            <h2>Register</h2>
            <form:form action="/register" method="post" modelAttribute="newUser">
                <div>
                    <div class="form-group">
                    <form:label path="userName">userName</form:label>
                    <form:input  class="form-control" path="userName"/>
                    <form:errors path="userName"/>
                    </div>
                    <div class="form-group">
                    <form:label path="email">email</form:label>
                    <form:input  class="form-control" path="email"/>
                    <form:errors path="email"/>
                    </div>
                    <div>
                    <form:label path="password">password</form:label>
                    <form:input  class="form-control" path="password"/>
                    <form:errors path="password"/>
                    </div>
                    <div>
                    <form:label path="confirm">confirm password</form:label>
                    <form:input  class="form-control" path="confirm"/>
                    <form:errors path="confirm"/>
                    </div>
                </div>
                <input type="submit" value="register">
            </form:form>
        </div>
        <div class="col">
            <h2>Login</h2>
            <div class="form-group">
                <form:form action="/login" method="post" modelAttribute="newLogin">
                    <div class="form-group">
                        <form:label path="email">email</form:label>
                        <form:input  class="form-control" path="email"/>
                        <form:errors path="email"/>
                    </div>
                    <div>
                        <form:label path="password">password</form:label>
                        <form:input  class="form-control" path="password"/>
                        <form:errors path="password"/>
                    </div>
                <input type="submit" value="login">
                </form:form>
            </div>
        </div>

    </div>
</div>
</body>
</html>
```

## Controller

- add [HomeController.java](src/main/java/tyler/loginreg/controllers/HomeController.java)