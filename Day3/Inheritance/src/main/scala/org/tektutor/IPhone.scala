package org.tektutor

class IPhone(name: String, camera: String, bluetooth: Boolean, wifi : Boolean ) 
  extends Mobile( name ):

  override def printDetails(): Unit =
    super.printDetails()
    println ( s"Camera   : $camera" )
    println ( s"Bluetooh : $bluetooth" )
    println ( s"WIFi     : $wifi" )

  def accessParentProtectedMethod() =
    println ( "\nInvoking parent protected method from child member method" )
    super.parentProtectedMethod()

  def accessParentPrivateMethod() =
    println ( "\nInvoking parent private method from child member method" )
    //super.parentPrivateMethod() This is expected to report compilation error as private methods of parent aren't inheritance by child

  def accessParentPublicMethod() =
    println ( "\nInvoking parent public method from child member method" )
    super.printDetails( )
