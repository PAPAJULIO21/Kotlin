package AlmacenBebidas

import java.util.Scanner

open class Bebida(val id: Int, val litros: Double, var precio: Double, val marca: String){

    open fun calcularPrecio(): Double{
        return precio
    }
    override fun toString(): String {
        return "Bebida(id=$id, litros=$litros, precio=$precio, marca='$marca')"
    }
}

