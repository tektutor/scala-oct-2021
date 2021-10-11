package org.tektutor

object DemonstrateBridgePattern extends App:

   val framework = new FrameworkBridge()

   val ver = framework.getVersion( )
   println ( s"Framework version => $ver" ) 

   val temp = framework.getTemperature ( "Hyderabad" )
   println ( s"Hyderabad Highest Temperature today => $temp" ) 
