<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="layout" content="app">
    <title>Welcome</title>
  </head>
  <body>
    <br>
    <h2>Welcome ${session.student.username}</h2>
    <g:link action="logout" controller="private">Logout</g:link>
    <table border="1">
      <thead>
        <tr>
          <th>Title</th>
          <th>Pages</th>
          <th>Price</th>
          <th></th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <g:each var="book" in="${books}">
          <tr>
            <td>${book.title}</td>
            <td>${book.pages}</td>
            <td>${book.price}</td>
            <td>
              <g:link action="bookDetails" controller="home" id="${book.id}">Details</g:link>
            </td>
            <td>
              <g:if test="${book.isBookIssued(session.student)}">
                Book Issued
              </g:if>
              <g:else>
                <g:link action="issueBook" controller="home" id="${book.id}">Issue Book</g:link>
              </g:else>
            </td>
          </tr>
        </g:each>
      </tbody>
    </table>
  </body>
</html>
