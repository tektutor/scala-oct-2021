package org.tektutor

class Addition extends IMathOperation:
  override def compute( 
    firstOperand: Double, 
    secondOperand: Double 
  ): Double =
    firstOperand + secondOperand
