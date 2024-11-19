package AlmacenBebidas

import java.util.Scanner
var matriz = Almacen()

fun  main(){
    var sc = Scanner(System.`in`)
    var validar = false
    while (!validar){
        println("----------------------")
        println("Que Quieres Hacer")
        println("----------------------")
        println("1- Añadir Bebida")
        println("2- Eliminar Bebida")
        println("3- Mostrar Almacen")
        println("4- Calcular Precio Total")
        println("5- Calcular Precio Total de una Marca")
        println("6- Calcular Precio Total de una columna")
        println("7- Salir")
        println("----------------------")
        var p = sc.nextInt()
        println("----------------------")

        when(p) {
            1 -> añadirBebida()
            2 -> eliminarBebida()
            3 -> print(matriz.mostrarBebidas())
            4 -> println(matriz.calcularPrecioTotal())
            5 -> {
                print("Dime la marca de la que quieres sacar su precio total: ")
                val marca = sc.next()
                println("----------------------")
                println(matriz.calcularPrecioPorMarca(marca))
            }
            6 -> {
                print("Dime la columna de la que quieres sacar su precio total: ")
                val columna = sc.nextInt()
                println("----------------------")
                println(matriz.calcularPrecioColumna(columna))
            }

            7 -> {validar = true
                println("Un abracete.")
                println("----------------------")
            }
            else ->println("No vale este digito")

        }
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

            matriz.agregarBebida(bebidaAgua)
            println("----------------------")

        }
        2->{
            println("Tienes que darme los siguientes datos: ")
            println("----------------------")
            //id,litros,precio,marca,porcentajeAzucar,promocion
            print("El ID de la bebida azucarada: ")
            val id = sc.nextInt()
            print("La capacidad de litros que tiene la bebida azucarada: ")
            val litros = sc.nextDouble()
            print("El precio de la bebida azucarada: ")
            val precio = sc.nextDouble()
            print("La marca del la bebida azucarada: ")
            val marca = sc.next()
            print("El porcentaje de azucar de la bebida azucarada: ")
            val porAzu = sc.nextInt()
            print("Tiene promocion la bebida azucarada: ")
            val promocion = sc.nextBoolean()
            println("----------------------")

            val bebidaAzucarada = BebidaAzucarada(id,litros,precio,marca,porAzu,promocion)
            matriz.agregarBebida(bebidaAzucarada)
        }
        else -> println("Error al introducir el numero")
    }

}

fun eliminarBebida(){
    var sc = Scanner(System.`in`)
    print("Dime el ID que quieres eliminar: ")
    var idBebida = sc.nextInt()
    println("----------------------")

    matriz.eliminarBebida(idBebida)

}

