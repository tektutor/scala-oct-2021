package org.tektutor

class Training ( var name: String, var duration: String):
  println ( "Default primary constructor invoked ...")
  private var _sn: Int = 1

  //Auxiliary constructor
  def this(sn: Int = 1, name: String, duration: String) =
    this( name, duration )
    println ( "Auxiliary constructor invoked ...")
    
    _sn = sn

  def printDetails(): Unit = 
    println ( "Serial No: " + _sn )
    println ( "Training : " + name )
    println ( "Duration : " + duration )

object TrainingMain:
  def main ( args : Array[String] ): Unit =
    //Invoke Default primary constructor
    val devOps = new Training ("DevOps", "5 Days" )

    //Invoke Auxiliary constructor
    val microServices = new Training ( 2, "MicroServices", "5 Days" )

    devOps.printDetails()
    microServices.printDetails()

    microServices.duration = "10 Days"
    microServices.printDetails()

    //microServices._sn = 10 //This will report compiler error
