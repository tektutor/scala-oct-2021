package org.tektutor

object Main:
  @main def demonstrateMapOperations() =
    val mobileContacts = Map(
      "Sriram" -> "99434 24532",
      "Nitesh" -> "89434 54542",
      "Rishi" -> "12434 56789"
    )

    println ( mobileContacts )

    //Accessing map elements - approach 1
    for (k,v) <- mobileContacts do
      println ( s"$k ==> $v" )

    //Accessing map elements - approach 2
    val sriram = mobileContacts("Sriram")
    val nitesh = mobileContacts("Nitesh")

    println ( s"Sriram's contact is $sriram" )
    println ( s"Nitesh's contact is $nitesh" )

    //Adding elements to map
    val latestContacts = mobileContacts + ( "Ismail" -> "1353465454" )
    println ( latestContacts )

    //Removing an element 
    val updatedContacts = latestContacts - "Nitesh"
    println ( updatedContacts )

    //Updating immutable map element
    val veryLatestContacts = updatedContacts.updated( "Ismail", "9999999999" ) 
    println ( veryLatestContacts )
