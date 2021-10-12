package org.tektutor

trait Topping {
    def getName() : String

    def getPrice() : Double

    def addTopping() : Topping
}

class BasePizza extends Topping {
    def getName() : String = "Pizza"

    def getPrice() : Double = 77.0

    def addTopping() : Topping = this
}

class CheeseTopping(override val topping : Topping) extends ToppingDecorator(topping) {
    override def getPrice() : Double = {
        super.getPrice() + 59.0
    }

    override def getName() : String = {
        val previous = super.getName()
        "Ocean Cheese " + previous
    }
}

class OnionTopping(override val topping : Topping) extends ToppingDecorator(topping) {
    override def getPrice() : Double = {
        super.getPrice() + 39.0
    }

    override def getName() : String = {
        val previous = super.getName()
        "Sprinkled Onion " + previous
    }
}

class ToppingDecorator(val topping : Topping) extends Topping {
    var nextTopping : Topping = topping

    def getName() : String = nextTopping.getName()

    def getPrice() : Double = nextTopping.getPrice()

    def addTopping() : Topping = this
}

class Pizza {
    var topping : Topping = new BasePizza

    def getPrice() : Double = {
        topping.getPrice()
    }

    def getName() : String = {
        topping.getName()
    }

    def addNewTopping(toppingName : String) : Boolean = {
        toppingName match
        {
            case "Onion" =>
            {
                this.topping = new OnionTopping(topping)
                true
            }
            case "Cheese" =>
            {
                this.topping = new CheeseTopping(topping)
                true
            }
            case _ =>
                println("Topping unavailable! Better luck next time! :(")
                false
        }
    }
}



