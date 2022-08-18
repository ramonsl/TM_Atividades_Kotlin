fun main() {
    val morningNotification = 79
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages < 100) {
        println("Você tem ${numberOfMessages} notificações.")
    } else {
        println("Seu telefone possui  99+ notificações.")
    }
}
