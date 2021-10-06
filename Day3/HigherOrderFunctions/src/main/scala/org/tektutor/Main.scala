package org.tektutor

object Main:
  def methodA( x : Int ) : Int =
    println ( "Method A invoked" )
    return x

  def methodB( x : Int ) : Int =
    println ( "Method B invoked" )
    return x

  def methodC( x : Double) : Int =
    println ( "Method C invoked" )
    return x
  
  def hofMethod( value: Int, f: Int=>Int ) =
    val x = f(value)
    println ( x )

  @main def demonstrateHOF() =
    hofMethod ( 100, methodB )
    hofMethod ( 200, methodA )
    //hofMethod ( 200, methodC ) - This will not work as methodC signature is different from expected
