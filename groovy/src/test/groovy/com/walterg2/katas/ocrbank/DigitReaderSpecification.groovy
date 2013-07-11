package com.walterg2.katas.ocrbank

import spock.lang.*
import com.walterg2.katas.ocrbank.Digit
import com.walterg2.katas.ocrbank.DigitReader

class DigitReaderSpecification extends Specification {
  @Unroll("Can read a #digit")
  def "reader can read a number from 0 to 1"() {
    given:
      def reader = new DigitReader()
    when:
      def result = reader.read(digitText)
    then:
      result == digit
    where:
      digitText << [Digit.ZERO,
                    Digit.ONE]
      digit << (0..1).collect { it.toString() }
  }


}