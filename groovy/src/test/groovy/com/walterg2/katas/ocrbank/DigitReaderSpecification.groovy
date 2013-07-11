package com.walterg2.katas.ocrbank

import spock.lang.*
import com.walterg2.katas.ocrbank.Digit
import com.walterg2.katas.ocrbank.DigitReader

class DigitReaderSpecification extends Specification {
  
  def "reader can read a 0"() {
    given:
      def reader = new DigitReader()
    when:
      def result = reader.read(Digit.ZERO)
    then:
      result == '0'
  }

  def "reader can read a 1"() {
    given:
      def reader = new DigitReader()
    when:
      def result = reader.read(Digit.ONE)
    then:
      result == '1'
  }
  
}