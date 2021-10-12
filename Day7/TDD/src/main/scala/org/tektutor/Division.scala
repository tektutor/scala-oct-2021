package org.tektutor

class Division extends IMathOperation:
  override def compute( 
    firstOperand: Double, 
    secondOperand: Double 
  ): Double =
    firstOperand / secondOperand
