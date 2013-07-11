package com.walterg2.katas.ocrbank

import com.walterg2.katas.ocrbank.Digit

class DigitReader {

  static def DIGITS = [
    (Digit.ZERO): '0'
  ]
  def read(digit) {
    DIGITS[digit]
  }
}