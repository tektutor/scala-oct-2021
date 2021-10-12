package org.tektutor

class Subtraction extends IMathOperation:
  override def compute( 
    firstOperand: Double, 
    secondOperand: Double 
  ): Double =
    firstOperand - secondOperand
