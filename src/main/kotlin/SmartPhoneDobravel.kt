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

class SmartPhoneDobravel(var isFolded:Boolean = ture): Phone() {
    override fun switchOn(){
        if(!isFolded){
            isScreenLightOn = true
        }
    }

    fun fold(){
        isFolded = true
    }

    fun unfold(){
        isFolded = false
    }
}

fun main() {
    val smardobra = SmartPhoneDobravel()

    smardobra.switchOn()
    smardobra.checkPhoneScreenLight()
    smardobra.unfold()
    smardobra.switchOn()
    smardobra.checkPhoneScreenLight()
}