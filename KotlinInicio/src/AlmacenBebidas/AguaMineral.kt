package AlmacenBebidas

class AguaMineral (id: Int,litros: Double,precio: Double,marca: String,private val origen:String):Bebida(id, litros, precio, marca){

    override fun toString(): String {
        super.toString()
        return "origen='$origen'"
    }
}