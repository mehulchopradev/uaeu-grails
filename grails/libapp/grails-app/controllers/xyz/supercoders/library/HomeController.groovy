package xyz.supercoders.library

class HomeController {

    BookService bookService
    // def bookService

    def index() {
      if (!session['student']) {
        redirect controller: 'public', action: 'index'
        return
      }

      // def books = Book.listOrderByPrice(order: 'desc')
      def books = bookService.getBooks('price', 'desc')
      [books: books]
    }

    def bookDetails(Book book) {
      [book: book]
    }

    def issueBook(Book book) {
      def student = session['student']
      student.attach() // add it back to the hibernate session
      // so that it can be used below in the addTo functiin
      /*def s = Student.get(student.id)
      book.addToStudents(s) */

      bookService.issueBook(student, book)

      redirect controller: 'home', action: 'index'
    }

    def transferBook(Book book) {
      [book: book]
    }

    def transfer(Long toWhomId, Long bookId) {
      def student = session['student']
      student.attach()

      bookService.transfer(student, toWhomId, bookId)

      redirect controller: 'home', action: 'index'
    }
}
