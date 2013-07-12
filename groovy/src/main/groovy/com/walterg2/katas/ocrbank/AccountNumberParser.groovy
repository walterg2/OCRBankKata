package com.walterg2.katas.ocrbank

class AccountNumberParser {

  private static final int DIGIT_WIDTH = 3
  private final DigitReader reader = new DigitReader()
  
  def read(fileLines) {
    def accountNumber = ''

    (1..9).each { numberPosition -> 
      accountNumber += parseDigit(fileLines, getPosition(numberPosition))
    }

    accountNumber

  }

  private String parseDigit(accountNumberLines, startingPosition) {
    List<String> digitLines = accountNumberLines.collect { line ->
      line.getAt(startingPosition..(startingPosition + 2))
    }

    def digit = digitLines.join()

    reader.read(digit)
  }

  private int getPosition(numberPosition) {
    (numberPosition - 1) * DIGIT_WIDTH
  }
}