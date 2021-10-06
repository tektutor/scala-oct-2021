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
- Chid auxiliary constructor must invoke the local primary constructor as the first statement
- However, the Child class when it extends can choose to invoke either the Primary constructor of Parent, or any
  of the auxiliary constructors of Parent
  
### Is it possible to invoke the Parent constructor arguments in a jumbled fashion
- the straight answer is not possible
- however using named arguments you can invoke the constructors with parameters supplied in any order
