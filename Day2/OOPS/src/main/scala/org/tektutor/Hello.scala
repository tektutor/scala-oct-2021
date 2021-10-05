package org.tektutor

class Hello: 
   println ( "Primary default constructor" ) 
   var msg : String = "Hello Scala"

   def sayHello() = 
     println ( msg )

object Main:
  @main def invokeHello() =
    val hello = Hello()
    hello.sayHello()
