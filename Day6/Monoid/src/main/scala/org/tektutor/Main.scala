package org.tektutor

import cats.Monoid
import cats.instances.string._ 
import cats.syntax.semigroup._ 

import cats.instances.int._
import cats.instances.option._ 
import cats.instances.map._ 
import cats.instances.tuple._

object demonstrateMonoid extends App: 
  val map1 = Map("a" -> 1, "b" -> 2 )
  val map2 = Map("b" -> 3, "d" -> 4, "a" -> 5)
  println ( map1 )
  println ( map2 )
  println ( map1 |+| map2 )

  println ("Option(10) |+| Option(21)")
  println ( Option(10) |+| Option(21) )

  val tuple1 = ("hello", 123)
  val tuple2 = ("world", 321)
  println ( tuple1 )
  println ( tuple2 )
  println ( tuple1 |+| tuple2 )
