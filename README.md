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
mv ./cs /usr/bin
```

### Installing Scala 3 Interactive Tool
```
cs install scala3-repl
```
