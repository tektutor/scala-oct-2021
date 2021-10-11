package org.tektutor

abstract class Drink:  
  def pickIngredients(): Unit
  def mix(): Unit
  def heat(): Unit
  def serve(): Unit
  def serveDrink(): Unit 

class Coffee extends Drink:
  override def pickIngredients(): Unit =
    println ( "\nGet milk power, sugar, cofee powder ...")

  override def mix(): Unit =
    println ( "Mixed all Coffee ingredients ...")

  override def heat(): Unit =
    println ( "Heated Coffee ..")

  override def serve(): Unit =
    println ( "Your Coffee is ready !")

  override def serveDrink(): Unit =
    pickIngredients()
    heat()
    mix()
    serve()

class Tea extends Drink:
  override def pickIngredients(): Unit =
    println ( "\nGet milk power, sugar, tea powder ...")

  override def mix(): Unit =
    println ( "Mixed all coffee ingredients ...")

  override def heat(): Unit =
    println ( "Heated Tea..")

  override def serve(): Unit =
    println ( "Your Tea is ready !")

  override def serveDrink(): Unit =
    pickIngredients()
    mix()
    heat()
    serve()

class VendingMachine:
  val coffee = new Coffee()
  val tea = new Tea()

  def makeCoffee(): Unit = coffee.serveDrink()
  def makeTea()   : Unit = tea.serveDrink() 

@main def demonstrateTemplatePattern() =
  val vendingMachine = new VendingMachine()
  vendingMachine.makeCoffee()
  vendingMachine.makeTea()
