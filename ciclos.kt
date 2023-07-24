fun main() {
    var opcion: Int

    do {
        println("---- Menú ----")
        println("3.1. Imprimir múltiplos de 3 entre 1 y 100.")
        println("3.2. Imprimir números impares entre 0 y 100.")
        println("3.3. Imprimir números pares entre 1 y 100.")
        println("3.4. Imprimir cuadrados de los números del 1 al 30.")
        println("3.5. Sumar cuadrados de los cien primeros números naturales.")
        println("3.6. Mostrar números entre dos valores en secuencia ascendente.")
        println("3.7. Sumar números ingresados hasta que se ingrese cero.")
        println("99. Salir")
        println("Ingrese la opción deseada:")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            3 -> ejercicio3_1()
            3.2 -> ejercicio3_2()
            3.3 -> ejercicio3_3()
            3.4 -> ejercicio3_4()
            3.5 -> ejercicio3_5()
            3.6 -> ejercicio3_6()
            3.7 -> ejercicio3_7()
            99 -> println("Saliendo del programa...")
            else -> println("Opción no válida. Por favor, elija una opción del menú.")
        }
        println()
    } while (opcion != 99)
}

fun ejercicio3_1() {
    println("Múltiplos de 3 entre 1 y 100:")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println()
}

fun ejercicio3_2() {
    println("Números impares entre 0 y 100:")
    for (i in 1..100 step 2) {
        print("$i ")
    }
    println()
}

fun ejercicio3_3() {
    println("Números pares entre 1 y 100:")
    for (i in 2..100 step 2) {
        print("$i ")
    }
    println()
}

fun ejercicio3_4() {
    println("Cuadrados de los números del 1 al 30:")
    for (i in 1..30) {
        val cuadrado = i * i
        print("$cuadrado ")
    }
    println()
}

fun ejercicio3_5() {
    var suma = 0
    for (i in 1..100) {
        suma += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $suma")
}

fun ejercicio3_6() {
    println("Ingrese el primer número (menor):")
    val menor = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo número (mayor):")
    val mayor = readLine()?.toIntOrNull() ?: 0

    println("Números entre $menor y $mayor en secuencia ascendente:")
    for (i in menor..mayor) {
        print("$i ")
    }
    println()
}

fun ejercicio3_7() {
    var numero: Int
    var suma = 0

    do {
        println("Ingrese un número (ingrese 0 para terminar):")
        numero = readLine()?.toIntOrNull() ?: 0

        if (numero != 0) {
            suma += numero
        }
    } while (numero != 0)

    println("La suma de los números ingresados es: $suma")
}
