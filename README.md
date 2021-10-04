### Traditional Programming Languages
- some support procedural style programming like c, while c++, java, C#, support object oriented programming features
- Object Oriented Programming Features
  - Class(user-defined data type)
  - Inheritance, Polymorphism, Encapsulation, Abstraction, Data hiding, access modifiers(public, protected & private)  - also support multi-threading (concurrent programming)
- Multiple threads are used to perform concurrent operations to improve the overall performance of the application
- But when multiple threads share a common resource, shared resources has to be accessed by multiple threads
  in a synchronized fashion, which kind of makes the thread run one at a time.  The very purpose of engaging mutltiple threads gets defeated when we use locks to synchronize threads
- Some commonly used Thread Synchronization Mechanisms (Locks/IPC)
  - Critical Section
  - Semaphore
  - Mutex

### What is Functional Programming?
- functions are first-class citizens
- functions can be assigned to variables as values
- functional programming styles leads to short and crisp code
- functional programming languages are close to mathematical expressions
- functional programming languages supports anonymous functions called Lambdas
- functional programming languages treats functions that has side-effects as impure functions
- functional programming languages discourages use of impure functions
- recommends pure functions, i.e functions without side-effects
- pure functions are functions that return the same values irrespective of how many times they are invoked
- pure functions doesn't modify any external state like writing to files, modifying an external variable/object
- lock free threads are faster compared to threads that are synchronized using locks
- functional programming languages encourages you develop lock free applications by treating function arguments as immutable(read only).  Only local variables are modified, while accessing global variables are discouraged as they require synchronization which will slow down your concurrent operations.

### Scala
 - is a statically-typed language but offers many features similar to dynamically typed languages
 - is a functional programming language that also supports Object Oriented Programming Features
 - is also an Object Oriented Programming Language
 - also works like a scripting language
 - suitable for concurrent programming
 - suitable for machine learning, deep learning, artificial intelligence based applications
 - ideal for developing big data applications
 - functions can accept Int, Float, Double, Short, Long as well functions as arguments
 - Int, Float, Double, Short, Long, BigDecimal are all Objects, hence there are no primitive data types in Scala
   as everything is an object.
 - value of functions can be assigned to variables
 - Higher Order Functions (HOF) - functions that take other functions are arguments
 - Scala allows defining functions within a function, such local functions are only visible within the outer function

### Installing JDK 11
```
sudo yum install -y java-11-openjdk-devel
```
When prompted for admin password, type rps@12345

### Installing Scala 3 (Do it as rps user)
```
cd ~/Downloads
wget https://github.com/lampepfl/dotty/releases/download/3.1.0-RC2/scala3-3.1.0-RC2.tar.gz
tar xvfz scala3-3.1.0-RC2.tar.gz
cd scala3-3.1.0-RC2
pwd
```
Assuming you have completed all the above instructions, you will have scala extracted in the below path
```
/home/rps/Downloads/scala3-3.1.0-RC2
```
You need to add the SCALA_HOME path to your rps home .bashrc file as shown below
```
subl ~/.bashrc
```
You need to append the below lines leaving the existing lines intact
```
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.12.0.7-0-el8_4.x86_64
export SCALA_HOME=/home/rps/Downloads/scala3-3.1.0-RC2
export PATH=$JAVA_HOME/bin:$SCALA_HOME/bin:$PATH
```

To apply the changes done in .bashrc file, you need to type the below command
```
source ~/.bashrc
```
You may now check the version of scala as shown below
```
cd ~
scala --version
scalac --version
```

### Installing Simple Build Tool (sbt)
```
curl -L https://www.scala-sbt.org/sbt-rpm.repo > sbt-rpm.repo
sudo mv sbt-rpm.repo /etc/yum.repos.d/
sudo yum install -y sbt
```
When prompts for root password, type rps@12345

### Your first program in Scala 3
```
object Hello:
  def main ( params: Array[String] ): Unit =
    println (  "Hello Scala 3 !" )
```
Scala Array is mutable(can be modified) while Scala List is immutable(read-only).

### Writing main entrypoint function in Scala 3 as a global function
```
def main ( args: Array[String] ): Unit =
  println ( "Hello Scala 3 !!" )
```

### Making any function as main entrypoint using @main annotation in Scala 3
```
@main def hello = println ( "Hello Scala 3 !!!" )
```

### Using for loop in Scala 3
```
object Main:
  def main ( params: Array[String] ): Unit =
    for ( i <- 0 to 10 ) do
      println ( i )
```sations
You may now compile and run the the application using the below commands
```
scalac for.scala
scala for.scala
```

The expected output is
<pre>
[jegan@tektutor Forloop]$ <b>scalac for.scala</b>
[jegan@tektutor Forloop]$ <b>scala for.scala</b>
0
1
2
3
4
5
6
7
8
9
10
</pre>

### A slight variation of the above code in Scala 3
```
object Main:
  def main( args: Array[String] ) : Unit =
    println ( )
    for ( i <- 0 to 10 ) do
      print ( s"$i " )
    end for
    println ( )
  end main
end Main
```
You may now compile and run the the application using the below commands
```
scalac for.scala
scala for.scala
```

The expected output is
<pre>
[jegan@tektutor Forloop]$ scalac for1.scala 
[jegan@tektutor Forloop]$ scala for1.scala 

0 1 2 3 4 5 6 7 8 9 10 
</pre>

### If then else statement
```
object Main:
  def main ( args: Array[String] ) : Unit =
    val x = 10

    if x < 20 then
      println ( s"$x is smaller than 20" )
    else
      println ( s"$x is greater than 20" )
    end if

  end main
end Main
```
The expected output is
<pre>
[jegan@tektutor IfElseStatement]$ scalac main.scala 
[jegan@tektutor IfElseStatement]$ scala main.scala 
10 is smaller than 20
</pre>

### While loop
```
object Main:
  @main def demonstrateWhileLoop ( ): Unit =
    var x = 10
    while x < 100 do
      print ( s"$x " )
      x += 10
```
The expected output is
<pre>
[jegan@tektutor WhileLoop]$ scalac while.scala 
[jegan@tektutor WhileLoop]$ scala while.scala 
10 20 30 40 50 60 70 80 90
</pre>

### For with yield
```
object Main:
  @main def demonstrateForYield ( ): Unit =
    val numbers = List ( 10, 20, 30 )
    
    val squares = for x <- numbers yield x * x
    
    println ( s"Squares of $numbers is $squares" )
    squares.foreach ( x => println ( x ) )
```

The expected output is
<pre>
[jegan@tektutor ForYield]$ <b>scalac main.scala</b>
[jegan@tektutor ForYield]$ <b>scala main.scala</b>
Squares of List(10, 20, 30) is List(100, 400, 900)
100
400
900
</pre>

### For yield with some foreach statements
```
object Main:
  @main def demonstrateForYield ( ): Unit =
    val numbers = List ( 10, 20, 30 )

    val squares = for x <- numbers yield x * x

    println ( s"Squares of $numbers is $squares" )
    //You may use any one of the below lines as they all do the same stuff. Just differents ways of printing a List
    squares.foreach ( println ( _ ) )
    squares.foreach ( x => println ( x ) )
    squares.foreach ( println )

    val squaresPlusFive = squares.map( x => x + 5 )
    println ( squaresPlusFive )
```
The expected output is
<pre>
[jegan@tektutor ForYield]$ scalac main.scala 
[jegan@tektutor ForYield]$ scala main.scala 
Squares of List(10, 20, 30) is List(100, 400, 900)
List(105, 405, 905)
</pre>

### Find how many times each letter occurs in a given string
```
val s: String = "This is a test sentence"
```
#### Solution - 1
```
import scala.language.postfixOps

object Main:
  def main( args: Array[String] ): Unit =
    val str: String = "This is a test statement"
    
    str.toCharArray.groupBy( f => f).foreach ( f => println ( s"$f._1 occurs $f._2.size ) times" )
```

#### Solution - 2

```
object Main:
  def main ( args: Array[String] ) : Unit =
    val str = "Shreesha"
    str.distinct.foreach ( ch => println ( ch, str.count( _ == ch ) ) )
```

#### Solution 3
```
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
```
