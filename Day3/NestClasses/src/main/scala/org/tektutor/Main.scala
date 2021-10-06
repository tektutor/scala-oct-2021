package org.tektutor

import scala.collection.mutable.ArrayBuffer

//Nested classes - class within a class
class Book (name: String): 
  class Chapter(val name: String):  
    def print() =
      println ( name )

  private var chapters = new ArrayBuffer[Chapter]

  def addChapter( chapterName: String ) =  
    val chapter = new Chapter( chapterName )
    chapters += chapter

  def print() =
    println ( name )
    for chapter <- chapters do
       chapter.print()

@main def demonstrateNestClasses( ) =
  val book = new Book ( "Mastering C++ Programming" )
  book.addChapter ( "Chapter 1 - Pointers" )
  book.addChapter ( "Chapter 2 - References" )

  book.print()
