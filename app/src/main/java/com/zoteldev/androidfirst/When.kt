package com.zoteldev.androidfirst

// Donde ya tengamos mas de 3 if- if else es recomendable usar el when

fun getMonth(month:Int) {
    when(month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> println("No es un mes válido")


    }
}

fun main() {
getMonth(4);
}