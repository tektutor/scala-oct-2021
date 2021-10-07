package org.tektutor

trait Log {
  def warning(message: String) : Unit
  def error(message: String) : Unit
}

enum Level:
  case WARNING, ERROR

final class Logger:
  def log(level: Level, message: String): Unit = println ( s"$level : $message " )

implicit class LoggerToLogAdapter(logger: Logger) extends Log :
  def warning(message: String):Unit = logger.log(Level.WARNING, message) 
  def error(message: String) : Unit = logger.log(Level.ERROR, message) 

@main def demonstrateAdapter() =
  val log: Log = new Logger()
  log.warning ( "some warning")
  log.error ( "some error" )
