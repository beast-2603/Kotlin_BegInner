fun main() {
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided ${myFirstDice.pick()} coloured dice rolled ${myFirstDice.roll()}!")
    
    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided ${mySecondDice.pick()} coloured dice rolled ${mySecondDice.roll()}!")
}

class Dice (val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
    fun pick(): String{
        return (arrayOf<String>("Red", "Blue", "Green", "White", "Black")).random()
    }
}