package org.tektutor

class Multiplication extends IMathOperation:
  override def compute( 
    firstOperand: Double, 
    secondOperand: Double 
  ): Double =
    firstOperand * secondOperand
