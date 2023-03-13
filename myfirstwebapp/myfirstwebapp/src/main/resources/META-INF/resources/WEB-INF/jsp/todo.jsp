<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <link
      rel="stylesheet"
      href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
    />
    <title>Add Todo Page</title>
  </head>
  <body>
    <div class="container">
      <h1>Enter todo details</h1>
      <form:form method="post" modelAttribute="todo">
        <label>Description</label>
        <br>
        <form:input type="text" path="description" required="required"/>
        <form:errors path="description" cssClass="text-warning"></form:errors>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <br>
        <input type="submit" class="btn btn-success">
      </form:form>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.3/jquery.min.js"></script>
  </body>
</html>
