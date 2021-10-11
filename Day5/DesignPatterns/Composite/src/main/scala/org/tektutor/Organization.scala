package org.tektutor
import scala.collection.mutable.ArrayBuffer

class Organization( name: String ):

  var departments : ArrayBuffer[Department] = new ArrayBuffer()

  def addDepartment ( dept : Department ) = departments += dept

  def print() = 
    println ( name )
    departments.foreach ( dept => dept.print() )
