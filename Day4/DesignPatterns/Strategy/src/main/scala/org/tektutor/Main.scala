package org.tektutor

type Strategy = (Int, Int) => Int 

class Calculator(compute: Strategy): 
  def use(a: Int, b: Int) = compute(a, b) 

val add: Strategy = _ + _
val subtract: Strategy = _ - _
val multiply: Strategy = _ * _
val divide: Strategy = _ / _

@main def demonstrateStrategy() =
  println ( new Calculator(add).use(2, 3) )
  println ( new Calculator(subtract).use(12, 3) )
  println ( new Calculator(multiply).use(10, 3) )
  println ( new Calculator(divide).use(10, 5) )
