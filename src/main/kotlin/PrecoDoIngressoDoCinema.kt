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
    if(age <= 12) 
        return 15
        
    if(age >= 13 && age <=60){
        if(isMonday) 
        	return  25
		else 
        	return 30
    }
    
    if(age>=61 && age <=100)
    	return 20
    
    return -1
}
