package org.tektutor

object DemonstrateImplicitReturnValue extends App:
  def F1(): Int =
    println ( "\nThis function F1 returns 500" )
    1

  println( F1() )

