fun main() {

    // usa a referência de parâmetro it no lugar dos nomes dos parâmetros e usa a sintaxe da lambda final.

        // Celsius para Fahrenheit: °F = 9/5 (°C) + 32
    printFinalTemperature(27.0,"Celsius", "Fahrenheit",{ 9.0 / 5.0 * it + 32 })
    //Kelvin para Celsius: °C = K - 273,15
    printFinalTemperature(350.0, "Kelvin", "Celsius",{ it - 273.15 })
    //Fahrenheit para Kelvin: K = 5/9 (°F - 32) + 273,15
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
