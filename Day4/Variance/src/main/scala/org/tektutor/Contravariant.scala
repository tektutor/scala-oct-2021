package org.tektutor.contravariant

trait Type[-T]:
  def drive(): Unit

class Car extends Type[Car]:
  def drive(): Unit = println (s"Parent class drive method")

class BMW extends Car with Type[BMW]:
  override def drive(): Unit = println(s"Subclass drive method")

class BMWPrinter:
  def print ( bmw: Type[BMW] ) =
    bmw.drive() 

@main def demonstrateVariance() =
  val bmwPrinter = BMWPrinter()
  bmwPrinter.print( new BMW ) 
  bmwPrinter.print( new Car ) //Contravariant 
