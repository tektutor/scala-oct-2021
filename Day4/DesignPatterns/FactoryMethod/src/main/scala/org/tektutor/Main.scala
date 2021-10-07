package org.tektutor

trait Car {
  def drive() : Unit
}

class BMW extends Car:
  override def drive(): Unit = println ( "\nYou are driving a BMW car" )

class Audi extends Car:
  override def drive(): Unit = println ( "\nYou are driving an Audi car" )

object Car:
  def apply(kind: String) = kind match 
    case "BMW" => new BMW()
    case "Audi" => new Audi()

object Main:
  @main def demonstrateFactoryMethod() =
    val car = Car("BMW") 
    car.drive()
