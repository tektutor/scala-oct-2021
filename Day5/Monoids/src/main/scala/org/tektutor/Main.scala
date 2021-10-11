package org.tektutor

case class Money(dollars: Int, cents: Int)

trait Data {
  val balance = Money(102, 44)
  val salary = Money(320, 0)
  val balances: Map[String, Money] = Map(
    "James" –> Money(212, 98),
    "Jimmy" –> Money(43, 44)
  )

  val salaries: Map[String, Money] = Map(
    "James" –> Money(500, 98),
    "Jimmy" –> Money(500, 44)
  )

  val marbles: Map[String, Int] = Map(
    "James" –> 4,
    "Jimmy" –> 5
  )

  val won: Map[String, Int] = Map(
    "James" –> 2,
    "Jimmy" –> 1
  )
}

object DemonstrateMonoid extends App {

  implicit val moneyMonoid = new Monoid[Money] {
    override def empty: Money = Money(0, 0)

    override def combine(x: Money, y: Money): Money = {
      Money(x.dollars + y.dollars + ((x.cents + y.cents) / 100),
        (x.cents + y.cents) % 100)
    }
  }

  val lastYearExpenses = List(Money(3, 4), Money(34, 5), Money(12, 0))

  def totalAllExpenses(expenses: List[Money])(implicit m: Monoid[Money]): Money = {
    expenses.foldLeft(m.empty){
      case (acc, money) => m.combine(acc, money)
    }
  }

  println(s"LastYearExpenses : ${totalAllExpenses(lastYearExpenses)}")
}
