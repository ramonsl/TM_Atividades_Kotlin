open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        //necessario deixar aberto
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "ligado" else "desligado"
        println("A tela do smartphone $phoneScreenLight.")
    }
}


class SmartPhoneDobravel(var  isFolded:Boolean = true): Phone() {
    override fun switchOn(){
        if(!isFolded){
            isScreenLightOn=true
        }
    }
    fun fold(){
        isFolded=true
    }

    fun unfold(){
        isFolded=false

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

