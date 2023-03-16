# Books Demo


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



- [ ] add dependencies to [pom.xml](./pom.xml)

```xml
        <!-- DEPENDENCIES FOR DISPLAYING JSPS AND USING JSTL TAGS -->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
```
- [ ] Add dependencies for Bootstrap:

```xml
		<!-- DEPENDENCIES FOR BOOTSTRAP -->
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator</artifactId>
            <version>0.46</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>5.2.3</version>
        </dependency>
```
- [ ] Add dependencies for Validations:

```xml
        <!-- DEPENDENCY FOR USING VALIDATION ANNOTATIONS -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
```
## Views
- [ ] add a view for show all [index.jsp](./src/main/webapp/WEB-INF/index.jsp)

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
    <title>Books</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
<h1>All Books</h1>
</body>
</html>
```

- [ ] add a view for show one [show.jsp](./src/main/webapp/WEB-INF/show.jsp)

- [ ] add a view for create [new.jsp](./src/main/webapp/WEB-INF/new.jsp)

- [ ] add a view for update [edit.jsp](./src/main/webapp/WEB-INF/edit.jsp)


## Controllers
- [ ] Make our [MainController](./src/main/java/tyler/booksdemo/controllers/MainController.java). :warning:<span style="color:red">WARNING!!</span> :warning: This link won't work in your file!!!

```java
@Controller
public class MainController {

    //! READ ALL
    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }
}
    
```

## Models (2 layers)

### persistance layer

- [ ] Created [Book.java](src/main/java/tyler/booksdemo/models/Book.java)

- [ ] Create [BookRepository.java](src/main/java/tyler/booksdemo/repositories/BookRepository.java) i.e. the ORM - object relational mapper

### service layer

- [ ] Create [BookService.java](src/main/java/tyler/booksdemo/services/BookService.java) 