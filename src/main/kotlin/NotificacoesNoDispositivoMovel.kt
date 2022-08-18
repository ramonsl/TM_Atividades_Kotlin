// Done
fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages >= 100){
        println("Seu telefone possuie 99+ notificacoes.")
    } else {
        println("Seu telefone possuie ${numberOfMessages} notificacoes.")
    }
}