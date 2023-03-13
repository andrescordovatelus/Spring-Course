<!DOCTYPE html>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <div class="container">
      <h1>Welcome to the login page!</h1>
      <pre>${errorMessage}</pre>
      <form method="post">
        <label>Name</label>
        <input type="text" name="name" />
        <label>Password</label>
        <input type="password" name="password" />
        <input type="submit" />
      </form>
    </div>
  </body>
</html>
