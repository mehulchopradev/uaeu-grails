package xyz.supercoders.library

class HomeController {

    def index() {
      if (!session['student']) {
        redirect controller: 'public', action: 'index'
        return
      }

      def books = Book.listOrderByPrice(order: 'desc')
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

      book.addToStudents(student)
      book.save flush: true

      redirect controller: 'home', action: 'index'
    }
}
