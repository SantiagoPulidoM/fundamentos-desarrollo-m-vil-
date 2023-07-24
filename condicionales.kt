fun main() {
    var opcion: Int

    do {
        println("---- Menú ----")
        println("2.1. Determinar si un número es positivo o negativo.")
        println("2.2. Encontrar el mayor y el menor de dos números.")
        println("2.3. Encontrar el mayor y el menor de tres números.")
        println("2.4. Sumar o restar dos números según una condición.")
        println("2.5. Calcular el cociente entre dos números.")
        println("2.6. Sumar o multiplicar dos números según una condición.")
        println("2.7. Determinar si un año es bisiesto.")
        println("99. Salir")
        println("Ingrese la opción deseada:")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            2 -> ejercicio2_1()
            2.2 -> ejercicio2_2()
            2.3 -> ejercicio2_3()
            2.4 -> ejercicio2_4()
            2.5 -> ejercicio2_5()
            2.6 -> ejercicio2_6()
            2.7 -> ejercicio2_7()
            99 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Por favor, elija una opción del menú.")
        }
        println()
    } while (opcion != 99)
}

fun ejercicio2_1() {
    println("Ingrese un número:")
    val numero = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero > 0) {
        println("El número es positivo.")
    } else if (numero < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}

fun ejercicio2_2() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toDoubleOrNull() ?: 0.0

    if (numero1 > numero2) {
        println("El mayor es el primer número: $numero1")
        println("El menor es el segundo número: $numero2")
    } else if (numero1 < numero2) {
        println("El mayor es el segundo número: $numero2")
        println("El menor es el primer número: $numero1")
    } else {
        println("Ambos números son iguales: $numero1")
    }
}

fun ejercicio2_3() {
    println("Ingrese el primer número:")
    val numero1 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número:")
    val numero2 = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el tercer número:")
    val numero3 = readLine()?.toIntOrNull() ?: 0

    val menor = minOf(numero1, numero2, numero3)
    val mayor = maxOf(numero1, numero2, numero3)

    println("El número menor es: $menor")
    println("El número mayor es: $mayor")
}

fun ejercicio2_4() {
    println("Ingrese el primer número (A):")
    val a = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el segundo número (B):")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    val resultado = if (a < b) {
        a + b
    } else {
        a - b
    }

    println("El resultado es: $resultado")
}

fun ejercicio2_5() {
    println("Ingrese el dividendo (A):")
    val a = readLine()?.toDoubleOrNull()

    println("Ingrese el divisor (B):")
    val b = readLine()?.toDoubleOrNull()

    if (b == 0.0) {
        println("La división no es posible, el divisor (B) debe ser diferente de cero.")
    } else {
        val cociente = a ?: 0.0 / (b ?: 1.0)
        println("El cociente entre A y B es: $cociente")
    }
}

fun ejercicio2_6() {
    println("Ingrese el primer número (A):")
    val a = readLine()?.toDoubleOrNull() ?: 0.0

    println("Ingrese el segundo número (B):")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    val resultado = if (a < 0 || b < 0) {
        a + b
    } else {
        a * b
    }

    println("El resultado es: $resultado")
}

fun ejercicio2_7() {
    println("Ingrese un año:")
    val anio = readLine()?.toIntOrNull()

    val esBisiesto = (anio != null) && ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))

    if (esBisiesto) {
        println("El año $anio es bisiesto.")
    } else {
        println("El año $anio no es bisiesto.")
    }
}
