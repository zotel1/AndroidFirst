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

// Una forma de simplificar los when
fun getTrimester(month:Int) {
    when(month) {
        1, 2, 3 -> print("Primer trimestre")
        4, 5, 6 -> print("Segundo trimestre")
        7, 8, 9 -> print("Tercer trimestre")
        10, 11, 12 -> print("Cuarto trimestre")
        else -> println("No es un trimestre válido")
    }
}

// Una forma de simplificar casos donde se puede escribir mucho codigo es a traves de los rangos
fun getSemester(month: Int) {
    when(month) {
        in 1 .. 6 -> println("Primer semestre")
        in 7 .. 12 -> println("Segundo semestre")
        !in 1 .. 12 -> println("Semestre no válido")
    }
}

fun result(value:Any) {
    when(value) {
        is Int -> value + value;
        is String -> println(value);
        is Boolean -> if(value) println("Buenassssss")
    }
}

// Con el uso de returns podemos retornar el valor directamente en lugar de estar imprimiendolo primera version
fun getSemester2(month: Int): String {
    when(month) {
        in 1 .. 6 -> return "Primer semestre"
        in 7 .. 12 -> return "Segundo semestre"
        !in 1 .. 12 -> return "Semestre no válido"
        else -> return "NO CUMPLIO LOS REQUERIMENTOS"
    }
}

// Esta es la segunda version donde utilizamos el result
fun getSemester3(month: Int): String {
    val result = when(month) {
        in 1 .. 6 -> "Primer semestre"
        in 7 .. 12 -> "Segundo semestre"
        !in 1 .. 12 -> "Semestre no válido"
        else -> "NO CUMPLIO LOS REQUERIMENTOS"
    }

    return result;
}


// Tambien podemos retornar directamente el when si gustamos
fun getSemester4(month: Int): String {
    return when(month) {
        in 1 .. 6 -> "Primer semestre"
        in 7 .. 12 -> "Segundo semestre"
        !in 1 .. 12 -> "Semestre no válido"
        else -> "NO CUMPLIO LOS REQUERIMENTOS"
    }
}

// si queremos simplificarlo un poco mas solo basta con quitarle el :String y las primeras llaves para dejarlo en una funcion simple
fun getSemester5(month: Int) = when(month) {
        in 1 .. 6 -> "Primer semestre"
        in 7 .. 12 -> "Segundo semestre"
        !in 1 .. 12 -> "Semestre no válido"
        else -> "NO CUMPLIO LOS REQUERIMENTOS"
    }

fun main() {
getMonth(4);
}