package org.tektutor

object Main:
  //This partial function only supports positive numbers hence it is called partial
  val positive: PartialFunction[Int, Int] = 
    case x if x >= 0 => x

  //This partial function only supports odd numbers
  val odd: PartialFunction[Int, Boolean] = 
    case x if x % 2 == 1 => true

  //This partial function only supports even numbers
  val even: PartialFunction[Int, Boolean] = 
    case x if x % 2 == 0 => true

  val evenCheck: PartialFunction[Int, Boolean] = positive andThen even
  val oddCheck : PartialFunction[Int, Boolean] = positive andThen odd

  def main( args: Array[String] ) : Unit =
    println ( evenCheck.isDefinedAt(1) ) //Will return false
    println ( evenCheck.isDefinedAt(20) ) //Will return true