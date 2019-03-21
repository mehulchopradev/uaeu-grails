package xyz.supercoders.library

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(SeriesService)
class SeriesServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test fibo series"() {
      def result
      when:
        result = service.getFiboSeries(8)
      then:
        result == '0 1 1 2 3 5 8 13 '
    }
}
