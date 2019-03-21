package xyz.supercoders.library

class Student {

    String username
    Integer password
    Character gender
    String country

    static hasMany = [books: Book]

    static belongsTo = Book

    static constraints = {
      username maxSize: 20
      country maxSize: 25
      gender nullable: true
    }
}
