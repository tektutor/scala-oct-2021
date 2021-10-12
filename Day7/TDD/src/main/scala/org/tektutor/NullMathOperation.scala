package org.tektutor

class NullMathOperation extends IMathOperation:
  def compute ( firstOperand: Double, secondOperand: Double ): Double =
    //Perform a error log
    throw new Exception("Unsupported math operation requested.")
