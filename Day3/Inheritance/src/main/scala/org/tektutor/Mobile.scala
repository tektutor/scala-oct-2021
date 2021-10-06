package org.tektutor

case class Mobile ( name : String ):

  var x : Int = 0

  //Auxiliary contructor
  def this ( someX : Int, name : String ) =
    this( name ) //Calling Local Primary constructor of Mobile
    x = someX

  private def parentPrivateMethod() =
    println ( "Parent - Mobile private method ..." )

  protected def parentProtectedMethod() =
    println ( "Parent - Mobile protected method ..." )

  def printDetails() : Unit =
    println ( s"Name : $name" )
