package org.tektutor

/**
 * Set is an iterable with no duplicate values.
 *
 * Has both mutable and immutable types.
 *
*/

object Main:
  @main def demonstrateSetOperations() =
    val numbers = Set ( 10, 20, 30, 40, 50 )
    
    println ( numbers )

    //Adding elements to Set
    val newNumbers = numbers + 60
    println ( newNumbers )

    //Adding a Seq to a Set
    val latestNumbers = numbers ++ Seq (70,80,90)
    println ( latestNumbers )

    //Deleting an item from Set
    val updatedNumbers = latestNumbers - 70
    val latestUpdatedNumbers = updatedNumbers -- Seq(40,50)
    println ( latestUpdatedNumbers )
