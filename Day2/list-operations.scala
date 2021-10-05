package org.tektutor

object Main:
  @main def demonstrateListOperations() =
    val l1 = List ( 1, 2, 3 )         // 1, 2, 3
    val l2 = (1 to 10).toList         // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val l3 = (0 to 100 by 10).toList  // 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100
    val l4 = List.range(1,6)          // 1, 2, 3, 4, 5, 6
    val l5 = List.range(1,10,2)       // 1, 3, 5, 7, 9

    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nPrint the lists created above")
    l1.foreach ( item => print (s"$item ") )
    println()

    println ( "\n(1 to 10).toList" )
    l2.foreach ( item => print ( s"$item " ) )
    println()

    println ( "\n(0 to 100 by 10).toList" )
    l3.foreach ( item => print ( s"$item " ) )
    println()

    println ( "\nList.range(1,10,2)" )
    l5.foreach ( item => print ( s"$item ") )
    println()

    //Delete
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding drop")
    println ( "\nBefore drop")
    println ( l3 )
    println ( "\nAfter drop( 3 )")
    println ( l3.drop( 3 ) )    // It is the printing the new list created in the process of drop(3), l3 remains is not modified

    //DropWhile - creates a new list by copying elements until the predicate(condition) is true. Copies the longest
    //prefix that satisfies the condition.
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding dropWhile")
    println ( "\nBefore using dropWhile")
    println ( l3 )
    println ( "\nAfter using l3.dropWhile ( _ < 40 )")
    println ( l3.dropWhile ( _ < 40 ) )   //This doesn't modify l3, it will return new list after dropping all elements < 40

    val myList = List ( 1, 4, 3, 4, 5 )
    println ( "Before dropWhile " )
    println ( myList )
    println ( "After dropWhile " )
    println ( myList.dropWhile ( _ <  3 ) )
    println ( myList )

    //Filter 
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding filter")
    println ( "\nBefore using filter")
    println ( l3 )
    println ( "\nAfter using filter ( _ < 40 )")
    println ( l3.filter( _ < 40 ) )

    val list1 = List ( 100, 20, 40, 200, 50, 30, 1 )
    println ( list1 )
    println ( list1.filter ( _ < 40 ) )

    //Slicing
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding slicing")
    println ( "\nBefore slicing")
    println ( l3 )
    println ( "\nAfter slicing l3.slice(2,5)")
    print ( l3.slice(2,5) )

    //head
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding head")
    println ( "\nBefore head")
    println ( l3 )
    println ( "\nAfter using head")
    println ( l3.head )

    //tail
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding tail")
    println ( "\nBefore tail")
    println ( l3 )
    println ( "\nAfter using tail")
    println ( l3.tail)

    //take 
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding take")
    println ( "\nBefore take")
    println ( l3 )
    println ( "\nAfter l3.take(3)")
    print ( l3.take(3) )
    
    //takeWhile 
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding takeWhile")
    println ( "\nBefore takeWhile")
    println ( l3 )
    println ( "\nAfter l3.takeWhile(_ < 50 )")
    print ( l3.takeWhile( _ < 50 ) )

    val listJumbled = List(1,0,10,8, 20, 50, 34, 4 )
    println ("Before takeWhile")
    println ( listJumbled )
    println ( "\nAfter listJumbled.takeWhile ( _ < 10 )" )
    println ( listJumbled.takeWhile ( _ <= 10 ) )

    //Flatten two lists
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding flatten")
    val listOfLists = List( List(10,20), List(30,40) ) 
    println ( "\nBefore flattening")
    println ( listOfLists )
    println ( "\nAfter flattening")
    println ( listOfLists.flatten )

    //map
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding map operation in a list")
    val myList1 = List ( "Hello", "World" )
    println ( "\nBefore map")
    println ( myList1 )
    println ( "\nAfter myList.map( _.toUpperCase )")
    println ( myList1.map ( _.toUpperCase ) )

    val listOfInts = List(5,3 ,10, 1, 20)
    println ( "\nOriginal list before map")
    println ( listOfInts )
    println ( "\nAfter map operation new list listOfInts.map( _ + 10 )")
    println ( listOfInts.map ( _ + 10 ) )

    //flatMap
    println ( "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++") 
    println ( "\nUnderstanding flatMap operation in a list")
    val myList2 = List ( "Hello", "World" )
    println ( "\nBefore map")
    println ( myList2 )
    println ( "After myList1.flatMap( _.toLowerCase )" )
    println ( myList2.flatMap ( _.toLowerCase ) )

    //reduceLeft

