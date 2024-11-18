package AlmacenBebidas

import java.util.Scanner

fun  main(){
    var sc = Scanner(System.`in`)
    println("----------------------")
    println("Que Quieres Hacer")
    println("----------------------")
    println("1- Añadir Bebida")
    println("----------------------")
    var p = sc.nextInt()
    println("----------------------")

    when(p) {
        1 -> añadirBebida()
        else -> println("No vale este digito")
    }

}

fun añadirBebida(){
    var sc = Scanner(System.`in`)
    println("----------------------")
    println("Que bebida quieres añadir")
    println("----------------------")
    println("1- Agua Mineral \n" +
            "2- Bebida Azucarada")
    println("----------------------")
    var opcion = sc.nextInt()
    println("----------------------")

    when(opcion){
        1 -> {
            println("Tienes que darme los siguientes datos: ")
            println("----------------------")
            //id,litros,precio,marca,origen
            print("El ID del agua mineral: ")
            val id = sc.nextInt()
            print("La capacidad de litros que tiene el agua mineral: ")
            val litros = sc.nextDouble()
            print("El precio del agua mineral: ")
            val precio = sc.nextDouble()
            print("La marca del agua mineral: ")
            val marca = sc.next()
            print("El origen del agua mineral: ")
            val origen = sc.next()

            val bebidaAgua = AguaMineral(id,litros,precio,marca,origen)
            val almacen = Almacen()
            almacen.agregarBebida(bebidaAgua)
            println(almacen.mostrarBebidas())

        }
        else -> println("Error al introducir el numero")
    }

}