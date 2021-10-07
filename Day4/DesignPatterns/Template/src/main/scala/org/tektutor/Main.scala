package org.tektutor

abstract class Drink:  
  def pickIngredients(): Unit
  def mix(): Unit
  def heat(): Unit
  def serve(): Unit

  final def serveDrink(): Unit =
    pickIngredients()
    mix()
    heat()
    serve()

class Coffee extends Drink:
  override def pickIngredients(): Unit =
    println ( "\nGet milk power, sugar, cofee powder ...")

  override def mix(): Unit =
    println ( "Mixed all Coffee ingredients ...")

  override def heat(): Unit =
    println ( "Heated Coffee ..")

  override def serve(): Unit =
    println ( "Your Coffee is ready !")

class Tea extends Drink:
  override def pickIngredients(): Unit =
    println ( "\nGet milk power, sugar, tea powder ...")

  override def mix(): Unit =
    println ( "Mixed all coffee ingredients ...")

  override def heat(): Unit =
    println ( "Heated Tea..")

  override def serve(): Unit =
    println ( "Your Tea is ready !")

class VendingMachine:
  val coffee = new Coffee()
  val tea = new Tea()

  def makeCoffee(): Unit = coffee.serveDrink()
  def makeTea()   : Unit = tea.serveDrink() 

@main def demonstrateTemplatePattern() =
  val vendingMachine = new VendingMachine()
  vendingMachine.makeCoffee()
  vendingMachine.makeTea()
