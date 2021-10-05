object Main:
  def main ( args: Array[String] ) : Unit =
    
    val msg = "This is a test sentence"

    val occurrences = for ch <- msg yield ( ch -> msg.count ( _ == ch ) )
    println (msg)

    println ( "Let's print every item in the map using foreach ..." )
    occurrences.foreach ( (key,value) => println ( s"$key occurred $value times." ) )

    println ( "Printing every item in the map using for ..." )
    for ( (key,value) <- occurrences) println ( s"$key occurred $value times." )

    println ( "Printing distinct items in the map ..." )
    val distinctOccurrencesMap = occurrences.distinct
    for ( (key,value) <- distinctOccurrencesMap ) println ( s"$key occurred $value times." )
