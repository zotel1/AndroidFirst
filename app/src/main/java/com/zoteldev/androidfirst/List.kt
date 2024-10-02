package com.zoteldev.androidfirst

fun main() {
    inmutableList()
    mutableList();
}

fun inmutableList() {

    // Lista
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())


    // Filtrar
    val example = readOnly.filter { it.contains("a") }
    println(example)

    readOnly.forEach { weekDay -> println(weekDay) }
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(0,"CrisDay")
    println(weekDays)

    if(weekDays.isEmpty()){
        // No voy a pintar nada por que no hay
    } else {
        println("Primera forma con un isEmpty")
        weekDays.forEach { weekDay -> println(weekDay) }
    }

    if(weekDays.isNotEmpty()) {
        println("Segunda forma con un isNotEmpty")
        weekDays.forEach { weekDay -> println(weekDay) }
    }

    //Aqui nos muestra el ultimo elemento de la lista
    weekDays.last()

    //Las iteraciones pueden ser iguales que en las arrays

}