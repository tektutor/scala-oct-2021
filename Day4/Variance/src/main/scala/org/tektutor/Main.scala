package org.tektutor
/*
trait Car(name: String) {
  def drive(): Unit
}*/

/**/
abstract class Car() {
  def name: String
  def drive(): Unit
  /*
  def printName( ) =
    println ( name )
  */
}
/**/

class BMW(name: String) extends Car:
  override def drive(): Unit = println("\nYou are driving a BMW")

class Audi(name: String) extends Car:
  override def drive(): Unit = println("\nYou are driving a Audi")

trait ICarFactory[K,+V] {
  var cars: Map[K,V]
}

class CarFactory extends ICarFactory[String,Car]:
  var bmw = new BMW("BMW X5")
  var audi = new Audi("Q7")

  //var cars = Map[String,Car]( "BMW"-> bmw, "AUDI" -> audi )
  cars = Map[String,Car]( "BMW"-> bmw, "AUDI" -> audi )

  def getCar(carBrand : String): Car =
    cars( carBrand )

@main def demonstrateVariance() =
  val carFactory = new CarFactory()
  var car = carFactory.getCar("BMW")
  car.drive()
  println ( car.name ) 

  car = carFactory.getCar("AUDI")
  car.drive()
  println ( car.name )

  /*
  val newCar = new BMW("BMW X7")
  println ( newCar.name )
  */
