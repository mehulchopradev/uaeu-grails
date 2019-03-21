<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="layout" content="app">
    <title>Welcome</title>
  </head>
  <body>
    <br>
    <g:if test="${flash.registerSuccess}">
      <b>Registration successful! Please login</b>
    </g:if>
    <g:if test="${flash.loginFailure}">
      <b>Invalid username or password</b>
    </g:if>

    <g:form controller="private" action="auth">
      <p>
        <g:textField name="username" placeholder="Enter username"/>
      </p>
      <p>
        <g:passwordField name="password" placeholder="Enter password"/>
      </p>
      <p>
        <input type="submit" value="Login">&nbsp;
        <g:link action="register" controller="public">New User ? Sign up</g:link>
      </p>
    </g:form>
  </body>
</html>
