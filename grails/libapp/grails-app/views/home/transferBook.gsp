<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="layout" content="app">
    <title>Transfer book</title>
  </head>
  <body>
    <br>
    <h2>Welcome ${session.student.username}</h2>
    <h2>${book.title}</h2>
    <i>Price : ${book.price}</i>
    <i>Pages : ${book.pages}</i>

    <g:form controller="home" action="transfer">
      <g:hiddenField name="bookId" value="${book.id}" />
      <g:textField name="toWhomId" placeholder="Enter id of student"/>
      <input type="submit" value="Transfer">
    </g:form>
  </body>
</html>
