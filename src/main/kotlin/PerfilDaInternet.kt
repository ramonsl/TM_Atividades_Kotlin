fun main() {
    val amanda = Person("Amanda", 33, "Tocar Piano", null)
    val maria = Person("Maria", 28, "Andar de bike", amanda)

    amanda.showProfile()
    maria.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Nome: $name")
        println("Idade: $age")
        if (hobby!=null){
            println("Gosta de :$hobby")
        }
        if(referrer != null){
            print("Tem a referencia de $name")
            if (referrer.hobby != null){
                print(", que gosta de ${referrer.hobby}")
            }else{
                println(".")
            }
        }else{
            println("Não possui referencias.")
        }
    }
}
