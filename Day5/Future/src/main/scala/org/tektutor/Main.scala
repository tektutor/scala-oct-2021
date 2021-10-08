package org.tektutor

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.Future._
import scala.concurrent.ExecutionContext.Implicits.global
import Console.{BLINK, WHITE, GREEN, GREEN_B, BLUE_B, RESET, YELLOW,YELLOW_B, REVERSED, RED,UNDERLINED}

object Example: 

  enum Colors:
    case Green, Yellow, Blue, Black, Blink 

  def taskHello : Future[Unit] = 
    Future {
      val thread = Thread.currentThread.getName
  
      printMessage ( s"[$thread] Started Task Hello", Colors.Yellow )
      printMessage ( s"[$thread] Hello", Colors.Green )
      printMessage ( s"[$thread] Finished Task Hello", Colors.Blink )
    }

  def printMessage ( message : String, color : Colors = Colors.Green) =
    color match 
      case Colors.Green  => Console.println(s"${RESET}${GREEN_B}$message${RESET}")
      case Colors.Yellow => Console.println(s"${RESET}${YELLOW_B}$message${RESET}")
      case Colors.Blue   => Console.println(s"${RESET}${BLUE_B}$message${RESET}")
      case Colors.Black => Console.println(s"${RESET}${REVERSED}${YELLOW_B}$message${RESET}")
      case Colors.Blink => Console.println(s"${RESET}${YELLOW}${BLUE_B}${BLINK}$message${RESET}")

  def main(args: Array[String]): Unit = 

    val thread = Thread.currentThread.getName

    printMessage(s"[$thread] Starting Future ...", Colors.Green)

    val task: Future[Unit] = taskHello

    printMessage(s"[$thread] Future continuing ...", Colors.Black)

    Await.result(task, Duration.Inf)
