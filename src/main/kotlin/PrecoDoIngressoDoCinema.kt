fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true

    println("O preço do bilhete de cinema para uma pessoa com idade é $child  \$${ticketPrice(child, isMonday)}.")
    println("O preço do bilhete de cinema para uma pessoa com idade é $adult  \$${ticketPrice(adult, isMonday)}.")
    println("O preço do bilhete de cinema para uma pessoa com idade é $senior  \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if ( age <= 12 ){
        return 15
    } else if ( age <= 60){
        if (isMonday){
            return 25
        } else {
            return 30
        }
    } else if ( age <= 100){
        return 20
    }
    return -1
}