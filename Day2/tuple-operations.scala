package org.tektutor

case class Duration(duration: String)

object Main:
  @main def demonstrateTupleOperations() =
    val t1 = ( 1, "DevOps", Duration("5 days" ) )

    println ("\nUnderstanding Tuple")
    println ("      -has one or more fields similar to Database table records.\n")
    println ("Let us say, there is a tuple t1 as shown below ...")
    println (s"\t $t1")

    //Retrieving individual fields from touple - approach 1
    println ( "\nWe can access its individual fields as")
    println ( "val ( sl, training, duration ) = t1" )

    val ( sl, training, duration ) = t1
    println ( s"\nSerial No : $sl" )
    println ( s"\nTraining  : $training" )
    println ( s"\nDuration  : $duration" )
    println ( s"\nDuration  : ${duration.duration}\n" )

    //Accessing Individual fields - approach 2
    println ( "We can also access individual fields as tuple as ")
    println ( "t1(0)\t t1(1)\t t1(2)\n")
    println ( s"${t1(0)}\t ${t1(1)}\t ${t1(2)}" )

