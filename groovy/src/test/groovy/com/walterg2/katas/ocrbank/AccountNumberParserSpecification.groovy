package com.walterg2.katas.ocrbank

import spock.lang.*

class AccountNumberParserSpecification extends Specification {

  def fileLocation = 'src/test/resources'

  def "Can convert a full account number to it's represented digits"() {
    given: "I have an account number parser"
      def parser = new AccountNumberParser()
    when: "I send it a file with a nine digit account number in it"
      def file = new File("${fileLocation}/111111111.txt")
      def result = parser.read(file.readLines())
    then: "I see the account number represented as digits"
      result == '111111111'
  }

  def "Can convert another account number to it's represented digits"() {
    given: "I have an account number parser"
      def parser = new AccountNumberParser()
    when: "I send it a file with a nine digit account number in it"
      def file = new File("${fileLocation}/123456789.txt")
      def result = parser.read(file.readLines())
    then: "I see the account number represented as digits"
      result == '123456789'
  }

}