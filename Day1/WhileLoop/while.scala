object Main:
  @main def demonstrateWhileLoop ( ): Unit =
    var x = 10
    while x < 100 do 
      print ( s"$x " )
      x += 10
