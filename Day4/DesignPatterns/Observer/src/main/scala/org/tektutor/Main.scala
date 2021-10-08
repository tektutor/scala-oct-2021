package org.tektutor

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map

trait IObservable {
  def addSubscriber ( whichNewsPaper: String, observer: IObserver ): Unit
  def notifyAll( message : String ): Unit
}

trait IObserver {
  def onUpdate( whichNewsPaper : String, message: String ) : Unit
}

class Observer(name: String) extends IObserver:
  def onUpdate ( whichNewsPaper: String, message : String ) : Unit = 
    println ( s"$name received => $whichNewsPaper" )

class Observable extends IObservable:
  var newsPapers : Map[ String, ArrayBuffer[IObserver] ] 
      = Map( 
          "Times of India" -> ArrayBuffer[IObserver](),
          "The Hindu" -> ArrayBuffer[IObserver](),
          "Deccan Herald" -> ArrayBuffer[IObserver]()
  ) 

  def this( name : String ) =
    this()

  def addSubscriber 
        ( 
          whichNewsPaper: String, observer : IObserver ): Unit = 
    val subscribers = newsPapers( whichNewsPaper )
    subscribers += observer
    newsPapers( whichNewsPaper ) = subscribers

  def notifyAll( whichNewsPaper : String ): Unit = 
    val subscribers = newsPapers( whichNewsPaper )

    subscribers.foreach( subscriber => 
        subscriber.onUpdate ( 
          whichNewsPaper, 
          "You got a new NewsPaper"
        )
    )

@main def demonstrateObserverPattern =
  var arun      = new Observer( "Arun" ) 
  var kumar     = new Observer( "Kumar" ) 
  var sharma    = new Observer( "Sharma" ) 

  var agency = new Observable("Star Newspaper Agency Pvt Ltd")
  agency.addSubscriber ( "Times of India", kumar )
  agency.addSubscriber ( "Deccan Herald", kumar)
  agency.addSubscriber ( "The Hindu", arun  )
  agency.addSubscriber ( "Deccan Herald", arun  )
  agency.addSubscriber ( "The Hindu", sharma)

  agency.notifyAll ( "Times of India" )
  agency.notifyAll ( "Deccan Herald" )
  agency.notifyAll ( "The Hindu" )
