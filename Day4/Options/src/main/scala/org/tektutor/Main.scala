package org.tektutor

import scala.collection.mutable.ArrayBuffer

class Course( name: String, duration: Option[String] ):
  override def toString() = 
    val msg = duration.getOrElse( "Duration depends on topics chosen" ) 
    s"$name -> $msg"

class TekTutor:
  val courses = new ArrayBuffer[Course]()
  def addCourse ( course : Course ) = courses += course
  def printCourses( ) = print ( courses )

object Main:
  @main def demonstrateOptions =
    val tekTutor = new TekTutor()
    tekTutor.addCourse ( new Course ( "DevOps", Some("40 Hours") ) )
    tekTutor.addCourse ( new Course ( "Customized DevOps", None ) )

    tekTutor.printCourses()
