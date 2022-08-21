fun main() {
    printFinalTemperature(27.0, "celsius", "fahrenheit",  convertCelsiusToFahrenheit)
    printFinalTemperature(350.0 , "kelvin", "celsius", convertKelvinToCelsius)
    printFinalTemperature(10.0, "fahrenheit", "kelvin", convertFahrenheitToKelvin)
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

val convertCelsiusToFahrenheit = { celsius: Double -> 9.0 / 5.0 * (celsius) + 32.0 }
val convertKelvinToCelsius = { kelvin: Double -> kelvin - 273.15 }
val convertFahrenheitToKelvin = { fahrenheit: Double -> 5.0 / 9.0 * (fahrenheit - 32.0) + 273.1 }