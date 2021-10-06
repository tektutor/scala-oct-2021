package org.tektutor

class Mobile ( protected var name : String ):

  private def parentPrivateMethod() =
    println ( "Parent - Mobile private method ..." )

  protected def parentProtectedMethod() =
    println ( "Parent - Mobile protected method ..." )

  def printDetails() : Unit =
    println ( s"Name : $name" )
