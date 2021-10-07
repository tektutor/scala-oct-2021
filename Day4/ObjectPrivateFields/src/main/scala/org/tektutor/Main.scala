package org.tektutor

class MyClass(private[this] var x: Int):
  def printThisX( ) =
    println ( x )

  def printOtherX( other : MyClass ) =
    println ( other.x ) //The x variable is private to Other object, hence reports compilation error

object Main:
  @main def demonstrateObjectPrivateVariable() =
    val x = new MyClass(10)
    val y = new MyClass(20)

    x.printThisX()
    x.printOtherX(y)
