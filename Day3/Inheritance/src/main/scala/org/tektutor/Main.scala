package org.tektutor

object Main:
  @main def demonstrateInheritance() =
    val iPhone13 = IPhone( "iPhone13", "20 Mega Pixel Rear Camera, 10 Mega Pixel Front Camera", true, true )
    iPhone13.printDetails() //invoking public method of iPhone object from main method scope
/*
    iPhone13.parentPrivateMethod()    //This will report compilation error
    iPhone13.parentProtectedMethod()  //This will report compilation error
*/
