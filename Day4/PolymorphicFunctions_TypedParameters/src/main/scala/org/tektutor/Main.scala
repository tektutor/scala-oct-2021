package org.tektutor

import scala.collection.mutable.ArrayBuffer

class MyList[A]:
  private var arr = ArrayBuffer[A]()

  def addItem ( x : A ) = arr += x

  def printList ( ) : Unit =
    println()
    for x <- arr do
      print ( s"$x " )
    println()

object Main:
  def main ( args : Array[String] ) : Unit =

    //Here MyList takes type Int as a Parameter
    val l = MyList[Int]
    l.addItem ( 10 )
    l.addItem ( 20 )
    l.addItem ( 30 )
    l.printList()

    //Here MyList takes type Int as a Parameter
    val daysOfWeek = MyList[String]
    daysOfWeek.addItem ( "Monday" )
    daysOfWeek.addItem ( "Tuesday" )
    daysOfWeek.addItem ( "Wednesday")
    daysOfWeek.printList()
