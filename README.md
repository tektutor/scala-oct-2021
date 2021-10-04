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
