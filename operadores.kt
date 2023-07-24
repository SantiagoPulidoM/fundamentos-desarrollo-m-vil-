import kotlin.math.pow
import kotlin.math.PI

fun main() {
    var opcion: Int

    do {
        println("---- Menú ----")
        println("1. Calcular el área de un triángulo.")
        println("2. Ingresar dos números y sumarlos.")
        println("3. Ingresar un número y calcular su cuadrado.")
        println("4. Convertir de euros a dólares.")
        println("5. Calcular el área y perímetro de un cuadrado.")
        println("6. Calcular el área y volumen de un cilindro.")
        println("7. Calcular la longitud y área del círculo inscrito en una circunferencia.")
        println("8. Calcular el promedio de tres números.")
        println("99. Salir")
        println("Ingrese la opción deseada:")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> calcularAreaTriangulo()
            2 -> sumarDosNumeros()
            3 -> calcularCuadradoDeNumero()
            4 -> convertirEurosADolares()
            5 -> calcularAreaYPerimetroCuadrado()
            6 -> calcularAreaYVolumenCilindro()
            7 -> calcularLongitudYAreaCirculoInscrito()
            8 -> calcularPromedioTresNumeros()
            99 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Por favor, elija una opción del menú.")
        }
        println()
    } while (opcion != 99)
}

fun calcularAreaTriangulo() {
    println("Ingrese la base del triángulo:")
    val base = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la altura del triángulo:")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val area = base * altura / 2
    println("El área del triángulo es: $area")
}

fun sumarDosNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull() ?: 0.0

    val suma = numero1 + numero2
    println("La suma de los dos números es: $suma")
}

fun calcularCuadradoDeNumero() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    val cuadrado = numero.pow(2)
    println("El cuadrado del número ingresado es: $cuadrado")
}

fun convertirEurosADolares() {
    println("Ingrese la cantidad en euros:")
    val euros = readLine()?.toDoubleOrNull() ?: 0.0

    val tasaConversion = 1.13 // Supongamos una tasa de conversión fija de 1 euro = 1.13 dólares.
    val dolares = euros * tasaConversion
    println("$euros euros equivalen a $dolares dólares.")
}

fun calcularAreaYPerimetroCuadrado() {
    println("Ingrese el lado del cuadrado:")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0

    val area = lado * lado
    val perimetro = 4 * lado

    println("El área del cuadrado es: $area")
    println("El perímetro del cuadrado es: $perimetro")
}

fun calcularAreaYVolumenCilindro() {
    println("Ingrese el radio del cilindro:")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese la altura del cilindro:")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    val areaBase = PI * radio.pow(2)
    val areaLateral = 2 * PI * radio * altura
    val areaTotal = 2 * areaBase + areaLateral
    val volumen = areaBase * altura

    println("El área total del cilindro es: $areaTotal")
    println("El volumen del cilindro es: $volumen")
}

fun calcularLongitudYAreaCirculoInscrito() {
    println("Ingrese el radio de la circunferencia:")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0

    val longitud = 2 * PI * radio
    val areaCirculoInscrito = PI * radio.pow(2)

    println("La longitud de la circunferencia es: $longitud")
    println("El área del círculo inscrito es: $areaCirculoInscrito")
}

fun calcularPromedioTresNumeros() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el tercer número:")
    val numero3 = readLine()?.toDoubleOrNull() ?: 0.0

    val promedio = (numero1 + numero2 + numero3) / 3
    println("El promedio de los tres números es: $promedio")
}
