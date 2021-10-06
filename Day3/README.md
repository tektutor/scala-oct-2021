### In case you haven't clone the TekTutor scala-oct-2021 repository yet, you may do now
```
cd ~
git clone https://github.com/tektutor/scala-oct-2021.git
cd scala-oct-2021
```
You are have the latest code !

### Executing the Inheritance lab exercise
```
cd ~/scala-oct-2021
git pull
cd Day3/Inheritance
sbt compile
sbt run
```

The expected output is
<pre>
jegan@tektutor Inheritance]$ ls
build.sbt  src
[jegan@tektutor Inheritance]$ <b>sbt compile</b>
[info] Updated file /home/jegan/scala-oct-2021/Day3/Inheritance/project/build.properties: set sbt.version to 1.5.5
[info] welcome to sbt 1.5.5 (Red Hat, Inc. Java 11.0.12)
[info] loading project definition from /home/jegan/scala-oct-2021/Day3/Inheritance/project
[info] loading settings for project inheritance from build.sbt ...
[info] set current project to inheritance (in build file:/home/jegan/scala-oct-2021/Day3/Inheritance/)
[info] Executing in batch mode. For better performance use sbt's shell
[info] compiling 3 Scala sources to /home/jegan/scala-oct-2021/Day3/Inheritance/target/scala-3.1.0-RC2/classes ...
[success] Total time: 4 s, completed Oct 5, 2021, 10:23:05 PM
[jegan@tektutor Inheritance]$ <b>sbt run</b>
[info] welcome to sbt 1.5.5 (Red Hat, Inc. Java 11.0.12)
[info] loading project definition from /home/jegan/scala-oct-2021/Day3/Inheritance/project
[info] loading settings for project inheritance from build.sbt ...
[info] set current project to inheritance (in build file:/home/jegan/scala-oct-2021/Day3/Inheritance/)
[info] running org.tektutor.demonstrateInheritance 
<b>Name : iPhone13
Camera   : 20 Mega Pixel Rear Camera, 10 Mega Pixel Front Camera
Bluetooh : true
WIFi     : true</b>
[success] Total time: 1 s, completed Oct 5, 2021, 10:23:16 PM
[jegan@tektutor Inheritance]$ 
</pre>

### Can the child auxiliary constructor invoke Parent auxiliary constructors directly?
- No, Scala doesn't allow Child auxiliary constructors to invoke Parent auxiliary constructor.
- Child auxiliary constructor must invoke the local primary constructor as their first statement
- However, the Child class when it extends can choose to invoke either the Primary constructor of Parent, or any
  of the auxiliary constructors of Parent
  
### Is it possible to invoke the Parent constructor arguments in a jumbled fashion
- the straight answer is not possible
- however using named arguments you can invoke the constructors with parameters supplied in any order

### Executing the default arguments and named arguments lab exercise
```
cd ~/scala-oct-2021
git pull
cd Day3/DefaultArguments
```

### What is a Higher Order Function (HOF)?
- HOF take other functions as arguments
- Certain HOF even could return other functions 
- functional programming support HOF

Some practical usecases for HOF 
- Given the List of data, maybe your HOF function will suggest which sorting algorithm can do the sorting faster.
  In this case, the return type of HOF will be function
- Let's say you are developing a Framework, in which you are developing several types of Sorting algorithms
   - Insertion Sort, Bubble Sort, Heap Sort, Quick Sort, Merge Sort, etc
   - Your sort method could take an user-defined function that will compare two values and tells the sorting algorithm, should the values be swapped or they are already in the expected sorted order.
   - The reason for taking such user-defined function's help to decide swap required or not, could arise as
     the data being sorted could be a user-defined data-type, may be object created out of your MyClass.

Unsorted data
10, 1, 200, 5, 20, 15, 0, 1000, 4

1, 10, 200, 5, 20, 15, 0, 1000, 4
1, 10, 5, 200, 20, 15, 0, 1000, 4
1, 10, 5, 20, 200

Sort 
- You need to develp a sorting algorithm in Scala
- In asceding order 
- In descending order

Sort - generic sorting algorithm
Scala - itself offers Sorting alogorith but let Scala team gives the user an option to pass an external function
        that will inform the Sort algorithm should it swap those two values or it is already in the order.
        
 sort( List[int], swap(int,int): Boolean )
 
