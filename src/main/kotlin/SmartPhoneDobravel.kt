class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isFolded: Boolean = true) : Phone(isScreenLightOn) {
    override fun switchOn() {
        if (!this.isFolded){
            isScreenLightOn = true
        }
    }

    fun fold(){
        this.isFolded = true
    }

    fun unFold(){
        this.isFolded = false
    }

} 
