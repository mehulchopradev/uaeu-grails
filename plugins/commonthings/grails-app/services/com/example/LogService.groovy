package com.example

import grails.transaction.Transactional

@Transactional
class LogService {

  def saveLog(String eventName) {
    def l = new Log(event: eventName, date: new Date())
    l.save flush: true
  }
}
