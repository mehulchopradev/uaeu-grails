package xyz.supercoders.library

import grails.transaction.Transactional

@Transactional
class SeriesService {

  def getFiboSeries(n) {
    def result = ''
    def a = 0
    def b = 1

    result += a + ' ' + b + ' '

    for (i in 1..n-2) {
      def c = a + b

      result += c + ' '

      a = b
      b = c
    }

    result
  }
}
