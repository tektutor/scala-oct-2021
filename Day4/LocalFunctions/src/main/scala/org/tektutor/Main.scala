package org.tektutor

def someFunction( ) =

  def localFunction( ) =
    println ( "Local Function " )

  localFunction()

object Main:
  @main def demonstrateLocalFunction() = 
    someFunction()
