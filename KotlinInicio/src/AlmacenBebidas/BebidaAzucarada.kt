package AlmacenBebidas

class BebidaAzucarada(id: Int,litros: Double,precio: Double,marca: String,val porcentajeAzucar: Int,val promocion: Boolean): Bebida(id, litros, precio, marca) {

    override fun calcularPrecio(): Double {
        return if (promocion){
            precio * 0.9
        }else{
            precio
        }
    }

    override fun toString(): String {
        return super.toString()
        println("Porcentaje de azucar: $porcentajeAzucar, Promocion: $promocion")
    }
}