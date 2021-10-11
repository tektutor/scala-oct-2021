### What is a Monoid ?
In maths, certain binary operations are classified as Monodic and non-monodic.
For example Addtion and Multiplication operations are Monadic operations as they satisfy the below rules
1. Associativity
2. They have an Identity element

#### Addition operation satisfies Associativity
10 + ( 50 + 60 ) = (10 + 50 ) + 60
10 + 110 = 60 + 60
120 = 120

#### Identity element 
For example, 0 is an identify element for addition
<pre>
0 + 10  = 10
100 + 0 = 100
</pre>

Whereas Subtraction operations doesn't support associativity rule
<pre>
i.e 100 - 1 is not same as 1 - 100 
100 -1  = +99
1 - 100 = -99
</pre>

#### Practical use-cases of Monoids
- In order to perform certain operations in a concurrent fashion across many threads in different servers the operation must be Monadic.
- Scala supports running such monoidal applications in different threads to solve Map-Reduce and other Big Data applications.

### Executing Monoid Lab exercise
```
cd ~/scala-oct-2021
git pull
cd Day6/Monoid
sbt compile && sbt run
```

### Executing Map Reduce Lab exercise that involves Monoid and Monads with Future
```
cd ~/scala-oct-2021
git pull
cd Day6/MonadsAndMonoids
sbt compile && sbt run
```

### Executing Covariant lab exercise
```
cd ~/scala-oct-2021
git pull
cd Day6/Variance
sbt compile && sbt run
```
You need to choose 2 to try the Covariant example.

### Executing Covariant lab exercise
```
cd ~/scala-oct-2021
git pull
cd Day6/Variance
sbt compile && sbt run
```
You need to choose 1 to try the Contravariant example.
