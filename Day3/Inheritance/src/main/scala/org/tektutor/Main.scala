package org.tektutor

object Main:
  @main def demonstrateInheritance() =
    val iPhone13 = IPhone( 200, "iPhone13", "20 Mega Pixel Rear Camera, 10 Mega Pixel Front Camera", true, true )
    iPhone13.printDetails() //invoking public method of iPhone object from main method scope

    val iPhone10 = IPhone( name="iPhone13", x=200, "20 Mega Pixel Rear Camera, 10 Mega Pixel Front Camera", true, true )
/*
    Phone13.name = "Samsung"          //This will report reassignment error as case keyword makes it as a val(immutable) 
    iPhone13.printDetails()
    iPhone13.parentPrivateMethod()    //This will report compilation error
    iPhone13.parentProtectedMethod()  //This will report compilation error
*/
