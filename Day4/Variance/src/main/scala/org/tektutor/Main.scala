package org.tektutor

trait Car {
  def drive(): Unit
}

class BMW extends Car:
  override def drive(): Unit = println("\nYou are driving a BMW")

class Audi extends Car:
  override def drive(): Unit = println("\nYou are driving a Audi")

trait ICarFactory[K,+V >: Car] {
  protected var cars: Map[K,V]
}

class CarFactory extends ICarFactory[String,Car]:
  var bmw = new BMW()
  var audi = new Audi()

  cars = Map[String,Car]( "BMW"-> bmw, "AUDI" -> audi )

  def getCar(carBrand : String): Car =
    cars( carBrand )

@main def demonstrateVariance() =
  val car = CarFactory().getCar("BMW").drive()
