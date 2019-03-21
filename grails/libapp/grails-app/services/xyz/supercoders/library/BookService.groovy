package xyz.supercoders.library

import grails.transaction.Transactional

@Transactional
class BookService {

  def getBooks(sortColumn, sortOrder) {
    Book.list(sort: sortColumn, order: sortOrder)
  }
}
