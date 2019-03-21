package xyz.supercoders.library

class PublicController {

    def index() {
      // def registerSuccess = flash.registerSuccess
      // [showRegSuccess: registerSuccess]
    }

    def hello() {}

    def register() {
      // imagine getting the countries from the database
      def countryList = ['India', 'UAE', 'France', 'USA']

      def student = flash.student

      [clist: countryList, student: student] // return data to the corresponding view
    }
}
