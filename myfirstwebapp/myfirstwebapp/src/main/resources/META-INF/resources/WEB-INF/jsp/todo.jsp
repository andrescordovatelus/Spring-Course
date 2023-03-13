<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      <form method="post">
        <label for="description">Description</label>
        <br>
        <input type="text" id="description" name="description">
        <br>
        <input type="submit" class="btn btn-success">
      </form>
    </div>
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.3/jquery.min.js"></script>
  </body>
</html>
