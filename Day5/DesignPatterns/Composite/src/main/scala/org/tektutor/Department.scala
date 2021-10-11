package org.tektutor
import scala.collection.mutable.ArrayBuffer

class Department( name: String ):

  var employees: ArrayBuffer[Employee] = new ArrayBuffer()

  def addEmployee( emp: Employee) = employees += emp 

  def print() = 
    println ( s"\t$name" )
    employees.foreach ( emp => emp.print() )
