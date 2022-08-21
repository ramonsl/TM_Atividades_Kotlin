fun main() {
    println("Hello world!")
}

open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}


class FoldablePhone( var isFolded: Boolean = false ) : Phone(true) {

    override fun switchOn(){
        if (isFolded != true){
            isScreenLightOn = true
        }
    }

    fun foldedOn() {
        isFolded = true
    }

    fun foldedOff() {
        isFolded = false
    }

}