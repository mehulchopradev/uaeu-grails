package xyz.supercoders.library

class Publicationhouse {

    String name
    Integer ratings

    static hasMany = [books: Book]

    static constraints = {
    }

    String toString() {
      this.name
    }
}
