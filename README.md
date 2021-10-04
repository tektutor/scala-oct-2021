Traditional Programming Languages
- may support object oriented programming features
- Class(user-defined data type)
- Inheritance, Polymorphism, Encapsulation, Abstraction, etc.,
- Also support multi-threading (concurrent programming)
- Thread Synchronization Mechanisations
  - Critical Section
  - Semaphore
  - Mutex

What is Functional Programming?

- functions are first-class citizen
- functions can be written be written
- functional programming short and crisp code
- recommends pure functions
- lock free threads - they are faster compared to threads that are synchronized using locks
- functional programming languages encourage you develop lock free applications

Scala
 - statically typed language but offers lot of features similar to dynamically typed languages
 - functional programming language
 - suitable for concurrent programming
 - suitable for machine learning, deep learning, artificial intelligence based applications
 - ideal for developing big data applications
 - functions can accept regular data types as well functions as arguments
 - value of functions can be assigned to variables

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

### Installing Coursier
```
curl -fLo cs https://git.io/coursier-cli-"$(uname | tr LD ld)"
chmod +x cs
sudo mv ./cs /usr/bin
```
When prompts for root password, type rps@12345

### Installing Scala 3 Interactive Tool
```
cs install scala3-repl
```
Open the ~/.bashrc file using the below command
```
subl ~/.bashrc
```

We need to add the below line to ~/.bashrc file
```
export PATH="$PATH:/home/rps/.local/share/coursier/bin"
```

To apply changes done in ~/.bashrc, run the below command
```
source ~/.bashrc
```
You should be able to run the below command 
scala3-repl from /home/rps

```
cd ~
scala3-repl
```
The expected output is
<pre>
scala> 
</pre>
To come out of scala prompt, you may use Ctrl + c

### Using for loop in Scala 3
```
object Main:
  def main ( params: Array[String] ): Unit =
    for ( i <- 0 to 10 ) do
      println ( i )
```
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

### If statement
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

### For yield
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
    //squares.foreach ( println ( _ ) )
    //squares.foreach ( x => println ( x ) )
    //squares.foreach ( println )

    val squaresPlusFive = squares.map( x => x + 5 )
    println ( squaresPlusFive )
```
The expected output is
<pre>
[jegan@tektutor ForYield]$ scalac main.scala 
[jegan@tektutor ForYield]$ scala main.scala 
Squares of List(10, 20, 30) is List(100, 400, 900)
List(105, 405, 905)
[jegan@tektutor ForYield]$ 
</pre>

### Find how many times each letter occurs in a given string
```
val s: String = "This is a test sentence"
```
Solution - 1
```
import scala.language.postfixOps

object Main:
  def main( args: Array[String] ): Unit =
    val str: String = "This is a test statement"
    
    str.toCharArray.groupBy( f => f).foreach ( f => println ( s"$f._1 occurs $f._2.size ) times" )
