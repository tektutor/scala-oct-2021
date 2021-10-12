package org.tektutor

class MathFactory:
   var mathOperation : IMathOperation = _

   def getMathObject ( mathOperator : String ): IMathOperation =
     mathOperator match
       case "+" => new Addition()
       case "-" => new Subtraction()
       case "*" => new Multiplication()
       case "/" => new Division()
       case _   => new NullMathOperation()
