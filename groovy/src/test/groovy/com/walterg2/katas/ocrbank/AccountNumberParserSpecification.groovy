package com.walterg2.katas.ocrbank

import spock.lang.*

class AccountNumberParserSpecification extends Specification {

  def fileLocation = 'src/test/resources'

  @Unroll("Converting a file with account number #accountNumber")
  def "Can convert a full account number to it's represented digits"() {
    given: "I have an account number parser"
      def parser = new AccountNumberParser()
    when: "I send it a file with a nine digit account number in it"
      def file = new File("${fileLocation}/${accountNumber}.txt")
      def result = parser.read(file.readLines())
    then: "I see the account number represented as digits"
      result == accountNumber
    where:
      accountNumber << [
        '000000051',
        '111111111',
        '123456789',
        '127538461',
        '200000000',
        '333333333',
        '490867715',
        '732589640',
        '999999999'
      ]
  }

}