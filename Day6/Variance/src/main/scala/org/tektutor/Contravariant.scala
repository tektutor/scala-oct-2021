package org.tektutor.contravariant

/**
 *  Here Car is a base class while BMW is a subclass.
 *
 *  If BMW object can be printed then its Base class also can be printed
 *
 */

trait Type[-T]:
  def drive(): Unit

class Car extends Type[Car]:
  def drive(): Unit = println (s"Parent class drive method")

class BMW extends Car with Type[BMW]:
  override def drive(): Unit = println(s"Subclass drive method")

class BMWPrinter:
  def print ( bmw: Type[BMW] ) =
    bmw.drive() 

@main def demonstrateContraVariance() =
  val bmwPrinter = BMWPrinter()
  bmwPrinter.print( new BMW ) 
  bmwPrinter.print( new Car ) //Contravariant 
