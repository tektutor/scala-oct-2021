package org.tektutor

import scala.collection.parallel.immutable.IndexedSeq
import scala.collection.parallel.immutable.Par
//import scala.collection.parallel.CollectionConverters._

class MyClass {
  def sum(numbers: IndexedSeq[Int]): Int = { 
    if (numbers.size <= 1) {
      numbers headOption getOrElse(0);
    }
    else {
      val (left,right) = numbers.splitAt(numbers.length/2);
      val sumLeft  : Par[Int] = Par.unit(sum(left));
      val sumRight : Par[Int] = Par.unit(sum(right));
      Par.get(sumLeft) + Par.get(sumRight);
    }
  }
}

object demonstratePureFunctionalParallelism extends App {
  val numbers : IndexedSeq[Int] 
    = IndexedSeq( 1, 5, 20, 3, 2, 200, 150, 10, 35, 12, 38, 17, 5, 0, 1000, 423, 217 );

  val total = sum( numbers );

  println ( "\nTotal is $total" );
}
