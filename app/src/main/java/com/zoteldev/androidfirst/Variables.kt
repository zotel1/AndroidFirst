package com.zoteldev.androidfirst

/*diferencias entre valores y variables,
las val serian como constantes y las var como variables*/

// val de la clase o variable global
val age:Int = 30;
var age2:Int = 7;
val stringExample2 = "Crisssss";

fun variablesAlfaNumericas() {

    /**
     * Variables Alfanuméricas*/


// Char

    val charExample1:Char = 'e';

    val charExample2:Char = '1';

    val charExample3:Char = '!';

// String

    val stringExample:String = "Primeros pasos en android";

    val stringExample3 = "4";
    val stringExample4 = "28";

    println("Buenas estos son mis"+ " " + stringExample);

    //val name = "Cristian";
    //print("Hola me llamo" + " " + name);

    /* Para sumar dos string antes debemos pasarlos a enteros
    * pero si no agrego el metodo .toInt() solo imprimira los string sin sumarlos, es decir los concatena*/

    println(stringExample3.toInt() + stringExample4.toInt())
}

fun variablesBoolean() {
    /*
* Variables booleanas*/

    val booleanExample1:Boolean = true;

    val booleanExample2:Boolean = false;

    val booleanExample3:Boolean = true;
}

fun variablesNumericas() {
    /***
     * Variables Númericas
     * */

// Int -2,123,456,788 a 2,123,456,788


    println(age2)
    age2 = 29;
    println(age2)

// Long  -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example:Long = 28;

// Float
    val floatExample:Float = 30.5f

// Double
    val doubleExample:Double = 3241.3123123

    println("Sumar: " + age + age2)

   // println("Restar: ")
   // println(age - age2)

    // Las operaciones de resta deben estar dentro de un parentesis por jemplo si queremos agregarle un println de un string
    println("Restar: " + (age - age2))

    println("Multiplicar: " + age*age2)

    println("Division: " + age/age2)

    println("Módulo: " + age % age2)

    var exampleSuma = age + floatExample
}

fun variablesConString() {
    var stringConcatenada:String = "hola";
    println(stringConcatenada)
    stringConcatenada = "Hola me llamo $stringExample2 y tengo $age años"
    println(stringConcatenada)

    // Pasamos de Int a String con el metodo .toString
    val exampleEdad:String = age.toString();
    println("Pasamos un entero a string con el dato de age: $exampleEdad")
}

fun main() {
    variablesNumericas();
    variablesBoolean();
    variablesAlfaNumericas();
    variablesConString();
}


