package xyz.supercoders.library

class Book {

    String title
    Integer pages
    Float price

    static belongsTo = [publicationhouse: Publicationhouse]

    static hasMany = [students: Student]

    static constraints = {
      price nullable: true, blank: true
    }

    def isBookIssued(student) {
      this.students.any {
        it.id == student.id
      }
    }
}
