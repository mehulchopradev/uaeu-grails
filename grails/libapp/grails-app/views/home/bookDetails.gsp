<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="layout" content="app">
    <title>Book details</title>
  </head>
  <body>
    <br>
    <h2>Welcome ${session.student.username}</h2>
    <h2>${book.title}</h2>
    <i>Price : ${book.price}</i>
    <i>Pages : ${book.pages}</i>

    <h3>Publication House</h3>
    <b>${book.publicationhouse.name}</b>
    <b>${book.publicationhouse.ratings}</b>
  </body>
</html>
