package PrimerosPasos

import java.awt.Stroke

fun getMes(mes:Int): String {
    return when (mes){
        in 1 .. 4 -> "Primer cuatrimestre"
        in 5.. 8  -> "Segundo cuatrimestre"
        in 9..12 -> "Tercer cuatrimestre"
        else -> "No existe ese puto mes"
    }
}

fun getNotifications(notificaciones:Int):String{
    return when(notificaciones){
        in notificaciones .. 0 -> "Error"
        in 0..99 -> " Tienes $notificaciones notificaciones"
        else -> "Tu telefono esta explotando! Tienes 99+ notificaciones"
    }
}

fun price(edad:Int,dia:String): Double {
    var num:Double = 0.0;

    when (edad){
        in edad .. 0 -> num = (-1).toDouble()
        in 1 .. 12 -> num = 5.4
        in 13 ..60 -> num = 8.5
        in 61 ..100 -> num = 5.toDouble()
        else -> num = (-1).toDouble()
    }

    if (dia.toUpperCase().equals("LUNES") && num == 8.5 ){
        num = 6.7.toDouble()
    }

    return num;
}

fun temperatura(temp:Double, tipo:String ):String{
    var cel:Double =0.0
    var fah:Double = 0.0
    var kel:Double = 0.0

    if (tipo.toUpperCase().equals("CELSIUS")){
        cel = temp
        fah = ((9/5)* cel)+32
        kel = ((5/9)*(fah-32)) +273.15
    }
    if (tipo.toUpperCase().equals("FAHRENHEIT")){
        fah = temp
        kel = ((5/9)*(fah-32)) +273.15
        cel = kel-273.15
    }
    if (tipo.toUpperCase().equals("KELVIN")){
        kel = temp
        cel = kel-273.15
        fah = ((9/5)* cel)+32
    }
    

    return "$cel grados Celsius son $fah grados Fahrenheit. \n" +
            "$kel grados kelvin son $cel grados Celsius. \n" +
            "$fah grados Fahrenheit son $kel grados Kelvin. "


}

val celsiusToFahrenheit: (Double) -> Double = { cel -> (9.0 / 5) * cel + 32 }
val fahrenheitToCelsius: (Double) -> Double = { fah -> (5.0 / 9) * (fah - 32) }
val celsiusToKelvin: (Double) -> Double = { cel -> cel + 273.15 }
val kelvinToCelsius: (Double) -> Double = { kel -> kel - 273.15 }
val fahrenheitToKelvin: (Double) -> Double = { fah -> (5.0 / 9) * (fah - 32) + 273.15 }
val kelvinToFahrenheit: (Double) -> Double = { kel -> celsiusToFahrenheit(kelvinToCelsius(kel)) }

fun temperaturUNoa(temp: Double, tipo: String): String {
    val resultado = when (tipo.toUpperCase()) {
        "CELSIUS" -> {
            val fah = celsiusToFahrenheit(temp)
            val kel = celsiusToKelvin(temp)
            "Celsius: $temp, Fahrenheit: $fah, Kelvin: $kel"
        }
        "FAHRENHEIT" -> {
            val cel = fahrenheitToCelsius(temp)
            val kel = fahrenheitToKelvin(temp)
            "Celsius: $cel, Fahrenheit: $temp, Kelvin: $kel"
        }
        "KELVIN" -> {
            val cel = kelvinToCelsius(temp)
            val fah = kelvinToFahrenheit(temp)
            "Celsius: $cel, Fahrenheit: $fah, Kelvin: $temp"
        }
        else -> "Unidad no reconocida"
    }
    return resultado
}


fun main() {
//    print("Dime cuantas notificaciones tienes:")
//   var pepe:Int = readln().toInt()
//    println(getNotifications(pepe));

    print(temperaturUNoa(27.0,"celsius"));
}