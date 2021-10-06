package org.tektutor

class MyClass:
  private var _x : Int = 0
  private var _y : Int = 0
  private var _z : Int = 0

  def someMethod( x : Int = 100, y : Int = 200, z : Int = 300 ) : Unit =
    println ( "someMethod invoked ...")

    _x = x
    _y = y
    _z = z

    println ( s"X => $_x, Y => $_y, Z => $_z" )
