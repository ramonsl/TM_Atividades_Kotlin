fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val hasReferrer: String = if (referrer != null) "Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}." else
            "Doesn't have a referrer."
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby. $hasReferrer")

    }
}