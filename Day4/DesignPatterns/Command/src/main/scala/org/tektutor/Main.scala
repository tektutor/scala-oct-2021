package org.tektutor

import scala.collection.mutable.ArrayBuffer

trait Device {
  def on(): Unit
  def off(): Unit
}

trait Command {
  def execute(): Unit
}

class TV extends Device:
  def on(): Unit =
    println ( "\nTV turned on ..." )

  def off(): Unit =
    println ( "\nTV turned off ..." )

class AC extends Device:
  def on(): Unit =
    println ( "AC turned on ..." )

  def off(): Unit =
    println ( "AC turned off ..." )

class BlueRayPlayer extends Device:
  def on(): Unit =
    println ( "BlueRay Player turned on ..." )

  def off(): Unit =
    println ( "BlueRay Player turned off ..." )

class TVTurnOn(tv: TV) extends Command:
  def execute(): Unit =
    tv.on()

class TVTurnOff(tv: TV) extends Command:
  def execute(): Unit =
    tv.off()

class ACTurnOn(ac: AC) extends Command:
  def execute(): Unit =
    ac.on()

class ACTurnOff(ac: AC) extends Command:
  def execute(): Unit =
    ac.off()

class BlueRayPlayerOn(player: BlueRayPlayer) extends Command:
  def execute(): Unit =
    player.on()

class BlueRayPlayerOff(player: BlueRayPlayer) extends Command:
  def execute(): Unit =
    player.off()

class UniversalRemote: 
  var turnOnCommands  = ArrayBuffer[Command]()
  var turnOffCommands = ArrayBuffer[Command]()
  var _name : String = "" 

  val tv = new TV()
  val ac = new AC()
  val player = new BlueRayPlayer()

  def this( name: String ) =
    this()
    _name = name 

    turnOnCommands += new TVTurnOn(tv)
    turnOnCommands += new ACTurnOn(ac)
    turnOnCommands += new BlueRayPlayerOn(player)

    turnOffCommands += new TVTurnOff(tv)
    turnOffCommands += new ACTurnOff(ac)
    turnOffCommands += new BlueRayPlayerOff(player)

  def turnOnAllDevices(): Unit =
    turnOnCommands.foreach ( command => command.execute() )

  def turnOffAllDevices(): Unit =
    turnOffCommands.foreach ( command => command.execute() )

@main def demonstrateCommand() = 
  val remote = new UniversalRemote("Universal Remote")

  remote.turnOnAllDevices()
  remote.turnOffAllDevices()
