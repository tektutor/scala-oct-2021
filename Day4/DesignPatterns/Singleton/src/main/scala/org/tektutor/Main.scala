package org.tektutor

object DBManager: 
  def connectDB() =
    println ( "\nConnected to Database ..")

  def disconnectDB() = 
    println ( "\nDB connection closed ...")

@main def demonstrateSingleton() =
  DBManager.connectDB()
  DBManager.disconnectDB()
