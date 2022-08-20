fun main() {
    val child = 5
    val adult = 28
    val senior = 87    
    val notClient = 101

    val isMonday = true

    println("O preço do bilhete de cinema para uma pessoa com idade $child é \$${ticketPrice(child, isMonday)}.")
    println("O preço do bilhete de cinema para uma pessoa com idade $adult é \$${ticketPrice(adult, isMonday)}.")
    println("O preço do bilhete de cinema para uma pessoa com idade $senior é \$${ticketPrice(senior, isMonday)}.")    
    println("O preço do bilhete de cinema para uma pessoa com idade $adult é \$${ticketPrice(adult, !isMonday)}.")    
    println("O preço do bilhete de cinema para uma pessoa com idade $child é \$${ticketPrice(child, !isMonday)}.")
    println("O preço do bilhete de cinema para uma pessoa com idade $notClient é \$${ticketPrice(notClient, !isMonday)}.")

}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
	return when(age) {
		in 0..12 -> 15
		in 13..60 -> if(isMonday) 25 else 30
		in 60..100 -> 20
		else -> -1
	}
}
