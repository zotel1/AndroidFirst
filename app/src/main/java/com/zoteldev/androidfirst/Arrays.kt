package com.zoteldev.androidfirst

// Estructura de datos que nos permite almacenar varias variables seguidas.
fun main() {

    // Indice 0-7
    // Tamaño 8
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(weekDays[0])
    println(weekDays.size)

    // Tamaños
    if (weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("No hay más valores en el array")
    }
    println(weekDays[0])
    // Modificar valores
    weekDays[0] = "Holiss"
    println(weekDays[0])
    // Modificar valores de nuevo
    weekDays[0] = "Buen Lunes"

    println(weekDays[0])

    // Bucles para arrays
    for(position in weekDays.indices) {
        println(weekDays[position])
    }

    // Esto nos va a dar la posicion y el valor
    for((position, value) in weekDays.withIndex()) {
        println("La posición $position, contiene $value")
    }

    for (weekDay in weekDays) {
        println("Ahora es $weekDay")
    }

}