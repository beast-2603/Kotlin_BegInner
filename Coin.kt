fun main() {
    val myFirstCoin = Coin()
    println("You got ${myFirstCoin.toss()}")
}

class Coin{
    fun toss(): String{
        return (arrayOf<String>("Head","Tail")).random()
    }
}