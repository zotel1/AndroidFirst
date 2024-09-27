package com.zoteldev.androidfirst

/*diferencias entre valores y variables,
las val serian como constantes y las var como variables*/

fun main() {

/***
 * Variables Númericas
 * */

// Int -2,123,456,788 a 2,123,456,788
val age:Int = 28;
var age1:Int = 29;
println(age1)
age1 = 25;
println(age1)

// Long  -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
val example:Long = 28;

// Float
val floatExample:Float = 30.5f

// Double
val doubleExample:Double = 3241.3123123

/**
 * Variables Alfanuméricas*/


// Char

val charExample1:Char = 'e';

val charExample2:Char = '1';

val charExample3:Char = '!';

// String

    val stringExample:String = "Primeros pasos en android";
    val stringExample2 = "Crisssss";
    val stringExample3 = "4";
    val stringExample4 = "28";

/*
* Variables booleanas*/

val booleanExample1:Boolean = true;

val booleanExample2:Boolean = false;

val booleanExample3:Boolean = true;



    println("Buenas estos son mis"+ " " + stringExample);

    //val name = "Cristian";
    //print("Hola me llamo" + " " + name);

    /* Para sumar dos string antes debemos pasarlos a enteros
    * pero si no agrego el metodo .toInt() solo imprimira los string sin sumarlos, es decir los concatena*/

    println(stringExample3.toInt() + stringExample4.toInt())

    var stringConcatenada:String = "hola";
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)

    // Pasamos de Int a String con el metodo .toString
    val exampleEdad:String = age.toString();
    println("Pasamos un entero a string con el dato de age: $exampleEdad")



}