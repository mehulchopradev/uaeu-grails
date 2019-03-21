package xyz.supercoders.library

import grails.transaction.Transactional
import grails.transaction.NotTransactional
import com.example.LogService

@Transactional
class BookService {

  LogService logService

  @NotTransactional
  def getBooks(sortColumn, sortOrder) {
    println sortColumn
    println sortOrder
    Book.list(sort: sortColumn, order: sortOrder)
  }

  def issueBook(student, book) {
    book.addToStudents(student)
    book.save flush: true

    logService.saveLog 'issuebook'
  }

  def transfer(student, Long toWhomId, Long bookId) {
    def toWhom = Student.get(toWhomId)
    def book = Book.get(bookId)

    book.removeFromStudents student
    book.save flush: true

    book.addToStudents toWhom
    book.save flush: true

    // always throw RuntimeException to the caller in order to have the
    // grails service rollback the transaction

    // deliberate to create some exceptional condition between a transaction
    def dummy = 'mehul'
    println dummy.length()
  }
}
