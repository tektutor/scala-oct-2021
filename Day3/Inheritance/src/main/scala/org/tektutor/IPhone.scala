package org.tektutor

class IPhone(x : Int, name: String, camera: String, bluetooth: Boolean, wifi : Boolean ) 
  extends Mobile( x, name ):

  var y: Int = 0 

  //Auxiliary constructor on the subclass
  def this ( somey : Int , x : Int, name: String, camera: String, bluetooth: Boolean, wifi : Boolean ) =
     this( x, name, camera, bluetooth, wifi ) //Invoking local Primary constructor i.e IPhone's primary constructor
     y = somey


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
