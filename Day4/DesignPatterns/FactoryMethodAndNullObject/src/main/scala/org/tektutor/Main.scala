package org.tektutor

trait Car {
  def drive() : Unit
}

class BMW extends Car:
  override def drive(): Unit = println ( "\nYou are driving a BMW car" )

class Audi extends Car:
  override def drive(): Unit = println ( "\nYou are driving an Audi car" )

class NullCar extends Car:
  override def drive(): Unit = println ( "\nUnsupported car" )

object Car:
  def apply(kind: String) = kind match 
    case "BMW" => new BMW()
    case "Audi" => new Audi()
    case _ => new NullCar()

object Main:
  @main def demonstrateFactoryMethod() =
    var car = Car("BMW") 
    car.drive()
    car = Car("Audi") 
    car.drive()
    car = Car("Skoda Kodiaq") 
    car.drive()
