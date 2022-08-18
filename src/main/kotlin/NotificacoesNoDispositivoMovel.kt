fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) 
        return println("Você tem $numberOfMessages notificações.")
    else 
        return println("Seu telefone possui  99+ notificações.")
}
