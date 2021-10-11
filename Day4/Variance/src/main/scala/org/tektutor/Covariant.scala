package org.tektutor.covariant

trait Car(name: String) {
  def drive(): Unit 
}

class BMW(name: String) extends Car(name):
  override def drive(): Unit = println(s"You are driving a $name")

class Audi(name: String) extends Car(name):
  override def drive(): Unit = println(s"You are driving an $name")

class VehiclePrinter[+A <: BMW,Audi](val vehicle : A) 

class CarPrinter:
  def print ( listOfCars: List[Car] ): Unit =
    listOfCars.foreach ( car => car.drive() )

@main def demonstrateVariance() =
  var listOfBMWs : List[BMW]  = List( BMW("BMW X1"), BMW("BMW X3"), BMW("BMW X5")  ) 
  var listOfAudis: List[Audi] = List( Audi("A4"), Audi("Audi A6"), Audi("Audi Q7") ) 

  val carPrinter = CarPrinter()
  carPrinter.print ( listOfBMWs ) //Covariant - we are able to substitute List[BMW] for List[Car]
  println()
  carPrinter.print ( listOfAudis) //Covariant - we are able to substitute List[Audi] for List[Car]
