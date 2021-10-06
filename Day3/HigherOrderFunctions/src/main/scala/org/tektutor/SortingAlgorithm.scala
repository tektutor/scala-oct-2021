package org.tektutor

object Main1:

  def heapSort( v : List[Int] ) : List[Int] = 
    println ( "Heap Sort algorthm is used to sort the list")
    //v is the input list
    //newList is the sorted one
    val newList = v
    return v

  def mergeSort( v : List[Int] ) : List[Int] = 
    println ( "Merge Sort alogorthm is used to sort the list")
    //v is the input list
    //newList is the sorted one
    val newList = v
    //Assuming the newList is sorted
    return v
  
  //List[Int] => List[Int] tells List[Input] is the input arguments taken by the function
  //List[Int] after the => indicates the fuctions return List[Int]
  def suggestAlgo( ) : List[Int] => List[Int]  = 
    //Assume this function reads the Algorithm name form the GUI as chosen by the user
    return heapSort //we are returning a function

  //Higher Order Function
  //f:() => String - The function takes zero argument but return a String 
  //f:(Int) => Int - This function takes one Int and Return an Int 

  def sort ( l : List[Int], f: () =>  List[Int] => List[Int] ): Unit = 
    val sortingAlgo = f( )  // This will invoke suggestAlgo method 
    val sortedList  = sortingAlgo( l ) //This might be a call to heapSort, mergeSort, etc/

  @main def demonstrateHOF1() = 
    val l = List(10,1,12)
    sort ( l, suggestAlgo ) 
