package org.tektutor

class MyThread(name: String) extends Thread:
  override def run() =
    for count <- Range(1,10) do
    println ( s"\nInside $name => $count" )
    Thread.sleep(1)
    Thread.`yield`()

@main def demonstrateThreads =
  val t1 = new MyThread("Thread-1")
  val t2 = new MyThread("Thread-2")
  val t3 = new MyThread("Thread-3")
  t1.start()
  t2.start()
  t3.start()

  t1.join()
  t2.join()
  t3.join()
