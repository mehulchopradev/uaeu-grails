<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="layout" content="app">
    <title>Sign up here</title>
  </head>
  <body>
    <g:form controller="private" action="registerUser">
      <p>
        <g:textField name="username" placeholder="Enter username" value="${student?.username}"/>
      </p>
      <p>
        <g:passwordField name="password" placeholder="Enter password" value="${student?.password}"/>
      </p>
      <p>
        Country:
        <g:select name="country" from="${clist}" value="${student?.country}" />
        <!--<select>
          <g:each var="country" in="${clist}">
            <option>${country}</option>
          </g:each>
        </select> -->
      </p>
      <p>
        Gender:
        <g:radioGroup name="gender" value="${student?.gender}" values="['M','F']" labels="['Male', 'Female']">
          ${it.radio} ${it.label}
        </g:radioGroup>
      </p>
      <p>
        <input type="submit" value="Register">&nbsp;
        <g:link action="index">Back</g:link>
      </p>
    </g:form>
    <g:renderErrors bean="${student}" as="list"/>
  </body>
</html>
