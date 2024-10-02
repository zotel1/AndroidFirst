package com.zoteldev.androidfirst.sintaxis


fun ifBasico() {
    val name = "Cris";

    if (name == "Zotel") {
        println("El nombre es Zotel")
    } else {
        println("El usuario registrado no es Cris")
    }
}

fun ifBoolean() {
    var soyFeliz:Boolean = false;

    if(!soyFeliz) {
        println("Estoy triste :(")
    } else {
        println("Estoy feliz! :D")
    }
}

fun ifInt() {
    var age:Int = 29

    if(age >= 18) {
        println("Puede beberse una cerveza")
    } else {
        println("Es menor para beberse una cerveza")
    }
}

fun ifMultiple() {
    var age:Int = 18;
    var parentPermision:Boolean = false
    var imHappy:Boolean = true;

    if(age >= 18 && parentPermision && imHappy) {
        println("Puedo beberme una cervecita")
    } else {
        println("Hoy no tengo ganas de beberme una cervecita")
    }
}

fun ifMultipleOr() {
    var pet:String = "dog";

    if(pet == "dog" || pet == "cat") {
        println("Mi mascota es un perro o un gato")
    }
}

fun ifAnidado() {
    val animal:String = "SpiderMan";

    if(animal == "dog") {
        println("El animal es un perro.")
    } else if (animal == "cat") {
        println("El animal es un gato")
    } else if (animal == "bird") {
        println("El animal es un ave")
    } else {
        println("El sujeto llamado $animal no es un animal")
    }
}

val separador:String = "-------------------------------------";

fun main() {
    ifBoolean()
    println(separador)
    ifBasico();
    println(separador);
    ifInt();
    println(separador);
    ifMultiple();
    println(separador);
    ifMultipleOr();
    println(separador);
    ifAnidado();
}