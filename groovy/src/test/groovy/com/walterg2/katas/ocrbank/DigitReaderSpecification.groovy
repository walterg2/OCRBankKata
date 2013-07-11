package com.walterg2.katas.ocrbank

import spock.lang.*

class DigitReaderSpecification extends Specification {
  
  @Unroll("Can read a #digit")
  def "reader can read a digit from 0-9"() {
    when:
      def result = reader.read(digitText)
    then:
      result == digit
    where:
      digitText << [Digit.ZERO, 
                    Digit.ONE,
                    Digit.TWO,
                    Digit.THREE,
                    Digit.FOUR,
                    Digit.FIVE,
                    Digit.SIX,
                    Digit.SEVEN,
                    Digit.EIGHT,
                    Digit.NINE]
      digit << [0..9].collect { it.toString() }
  }
}