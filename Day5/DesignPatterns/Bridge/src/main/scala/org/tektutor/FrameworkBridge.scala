package org.tektutor

class FrameworkBridge:
   val framework = new Framework()

   def getVersion() = framework.getVersion() 

   def getTemperature( city: String ): String =
     val currentDate = "08-10-2021" //Assume we retrieved from System date
     framework.getTemperature( city, currentDate ) 

