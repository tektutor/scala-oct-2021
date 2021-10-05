object Main:
  @main def demonstrateForYield ( ): Unit =
    val numbers = List ( 10, 20, 30 )

    val squares = for x <- numbers yield x * x
    
    println ( s"Squares of $numbers is $squares" )
    //squares.foreach ( println ( _ ) )
    //squares.foreach ( x => println ( x ) )
    //squares.foreach ( println )

    val squaresPlusFive = squares.map( x => x + 5 )
    println ( squaresPlusFive )
    
