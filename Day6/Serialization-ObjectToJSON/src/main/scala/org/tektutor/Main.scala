package org.tektutor

import com.google.gson.Gson

case class Person(name: String, address: Address)
case class Address(city: String, state: String)

object GsonTest extends App {
  val p = Person("Alvin Alexander", Address("Talkeetna", "AK"))

  //Seriallizing a person object to json
  val gson = new Gson
  val jsonString = gson.toJson(p)
  println(jsonString)

  //Deserialising the Json String to the Person Object in Scala.
  val person:Person = gson.fromJson(jsonString,classOf[Person])
  println(person)

  println ( person.name )
  println ( person.address )
}
