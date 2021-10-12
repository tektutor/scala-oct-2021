package org.tektutor

import org.junit.Test
import org.junit.Assert._

class RPNCalculatorTest:

  @Test
  def testSimpleAddition(): Unit =

    val rpnCalculator = new RPNCalculator()

    var actualResult: Double = rpnCalculator.compute ( "10 15 +" )
    var expectedResult: Double = 25.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "100 15 +" )
    expectedResult = 115.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "1000 15 +" )
    expectedResult = 1015.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

  @Test
  def testSimpleSubtraction(): Unit =

    val rpnCalculator = new RPNCalculator()

    var actualResult: Double = rpnCalculator.compute ( "10 15 -" )
    var expectedResult: Double = -5.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "100 15 -" )
    expectedResult = 85.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "1000 15 -" )
    expectedResult = 985.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

  @Test
  def testSimpleMultiplication(): Unit =

    val rpnCalculator = new RPNCalculator()

    var actualResult: Double = rpnCalculator.compute ( "10 15 *" )
    var expectedResult: Double = 150.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "100 15 *" )
    expectedResult = 1500.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "10 18 *" )
    expectedResult = 180.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

  @Test
  def testSimpleDivision(): Unit =

    val rpnCalculator = new RPNCalculator()

    var actualResult: Double = rpnCalculator.compute ( "100 5 /" )
    var expectedResult: Double = 20.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "100 10 /" )
    expectedResult = 10.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

    actualResult = rpnCalculator.compute ( "15 3 /" )
    expectedResult = 5.0 
    assertEquals ( expectedResult, actualResult, 0.0001 )

  @Test
  def testComplexExpression(): Unit =
    val rpnCalculator = new RPNCalculator()

    var actualResult: Double = rpnCalculator.compute ( "10 50 * 10 5 - +" )
    var expectedResult: Double = 505 
    assertEquals ( expectedResult, actualResult, 0.0001 )
