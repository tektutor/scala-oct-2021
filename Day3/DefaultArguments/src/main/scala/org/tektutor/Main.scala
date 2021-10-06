package org.tektutor

object Main:
  def main ( args: Array[String] ) : Unit =
    val myClassObject = MyClass()

    println ( "When all arguments are supplied in the method call" )
    myClassObject.someMethod ( 10, 20, 30 ) // x=10 y=20 z=30 

    println ( "Only two arguments are passed while 3 are expected" )
    myClassObject.someMethod ( 20, 30 ) // x=20 y=30 and z will be assigned efault value

    println ( "Only one argument is passed while 3 are expected" )
    myClassObject.someMethod ( 20) // x=20 y and z will be assigned default values

    //Examples for named argument 
    println ( "\nDefault arguments ...")
    println ( "someMethod ( x=2000 )" )
    myClassObject.someMethod ( x=2000 ) //x=2000 y=200  z=300

    println ( "someMethod ( y=2000 )" )
    myClassObject.someMethod ( y=2000 ) //x=100  y=2000 z=300

    println ( "someMethod ( z=2000 )" )
    myClassObject.someMethod ( z=2000 ) //x=100  y=200  z=2000

    myClassObject.someMethod ( ) //x=100  y=200  z=300

    //Named argument
    println ( "\nUsing named arguments here ...")

    println ( "someMethod(x=1,y=2,z=3)" )
    myClassObject.someMethod (x=1,y=2,z=3) //x=1 y=2 z=3

    println ( "someMethod(y=2,z=3,x=1)" )
    myClassObject.someMethod (y=2,z=3,x=1) //x=1 y=2 z=3

    println ( "someMethod(z=3,x=1,y=2)" )
    myClassObject.someMethod (z=3,x=1,y=2) //x=1 y=2 z=3
    


