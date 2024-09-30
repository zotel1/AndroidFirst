package com.zoteldev.androidfirst


// Con el simbolo de interrogacion no se rompe con los null
//Que dice el print? que si el vañlor no es nulo que imprima el caracter en la posicion 3
// y si es nulo que imprima el mensaje en este caso lo hacemos asi ?: "Es nulo wey"
fun main() {
    var name:String? = null;

    println(name?.get(3) ?: "Es nulo wey")
}