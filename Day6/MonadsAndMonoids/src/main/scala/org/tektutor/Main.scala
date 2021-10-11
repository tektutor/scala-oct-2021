package org.tektutor

import scala.concurrent.ExecutionContext.Implicits.global
import cats.instances.future._ 
import cats.instances.list._ 
import cats.syntax.applicative._ 
import cats.Monad
import scala.concurrent.{Await,Future}
import scala.concurrent.duration.Duration
import concurrent.duration._
import scala.language.postfixOps
import scala.language.postfixOps._
import cats.instances.int._

def computeSum1To100() = 
  val numbers1To100 = Range(1,100).toList
  val future1 = Future {
    numbers1To100.foldLeft(0)(_ + _)
  }
  Await.result(future1, 2 seconds)

def computeSum100To200() =
  val numbers100To200 = Range(100,200).toList
  val future2 = Future {
    numbers100To200.foldLeft(0)(_ + _)
  }
  Await.result(future2, 2 seconds)

object DemonstrateMapRedueWithMonadsAndMonoidsWithFuture extends App:
   
  val res1 = computeSum1To100()
  val res2 = computeSum100To200()

  println ( s"Sum of $res1 + $res2 is ${res1 + res2}" )
