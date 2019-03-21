package xyz.supercoders.library

// Command objects
class StudentCommand {
  String username
  Integer password
  Character gender
  String country

  String toString() {
    "Name : ${this.username}\nPass: ${this.password}\nGen: ${this.gender}\nCountry: ${this.country}"
  }
}

class PrivateController {

    /* def registerUser(String username, Integer password, Character gender, String country) {
      // getting request data
      //println params['username']
      //println params['country']

      println username
      println password
      println gender
      println country
    } */

    /* def registerUser(StudentCommand student) {
      println student

      // TODO: save the data in the database

      redirect controller: 'public', action: 'index'
    } */

    def registerUser(Student student) {
      def savedStudent = student.save flush: true

      println 'Saved student is'
      println savedStudent

      if (savedStudent) {
        flash.registerSuccess = true
        redirect controller: 'public', action: 'index'
      } else {
        // imagine getting the countries from the database
        def countryList = ['India', 'UAE', 'France', 'USA']
        render(view: '/public/register', model: [clist: countryList, student: student])
        // render "success"

        // flash.student = student
        // redirect controller: 'public', action: 'register'
      }
    }

    def auth(String username, Integer password) {
      def student = Student.findByUsernameAndPassword(username, password)
      if (student) {
        session['student'] = student
        redirect controller: 'home', action: 'index'
      } else {
        flash.loginFailure = true
        redirect controller: 'public', action: 'index'
      }
    }

    def logout() {
      session.invalidate()
      redirect controller: 'public', action: 'index'
    }

}
