package org.tektutor

sealed trait Visitable {
  def accept(visitor: Visitor): Double =
    visitor.visit(this)
}

case class Liquor (price: Double) extends Visitable
case class Tobacco (price: Double) extends Visitable
case class Necessity (price: Double) extends Visitable

trait Visitor {
  def visit: Visitable => Double
}

object TaxVisitor extends Visitor {
  def visit: Visitable => Double = {
    case l: Liquor =>
      println("liquor tax")
      l.price * 0.18
    case t: Tobacco =>
      println("tobacco tax")
      t.price * 0.30
    case n: Necessity =>
      println("necessity tax")
      n.price * 0.10
  }
}
