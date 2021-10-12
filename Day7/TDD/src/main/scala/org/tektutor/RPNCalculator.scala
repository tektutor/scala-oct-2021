package org.tektutor

import scala.collection.mutable.Stack

class RPNCalculator:
  private var firstValue : Double = _
  private var secondValue: Double = _
  private var result     : Double = _
  private var numberStack: Stack[Double] = new Stack()
  private var mathOperation: IMathOperation = _ 

  private def _extractInputs() =
    secondValue = numberStack.pop()
    firstValue  = numberStack.pop()

  private def _add() =
    result = firstValue + secondValue

  private def _subtract() =
    result = firstValue - secondValue

  private def _multiply() =
    result = firstValue * secondValue

  private def _divide() =
    result = firstValue / secondValue

  private def _isMathOperator(rpnToken : String): Boolean = 
    "+-*/" contains rpnToken

  def compute ( rpnExpression : String ): Double =
    // "100 5 * 10 5 - +"
    // rpnTokens Array( "100", "5", "*", "10", "5", "-", "+" )
    val rpnTokens = rpnExpression.split(" ")
    
    rpnTokens.foreach ( rpnToken => 
        if _isMathOperator ( rpnToken ) then
           _extractInputs()
           mathOperation = MathFactory().getMathObject( rpnToken )
           result = mathOperation.compute ( firstValue, secondValue )
           numberStack.push ( result )
        else
          numberStack.push ( rpnToken.toDouble )
    )

    numberStack.pop() 
