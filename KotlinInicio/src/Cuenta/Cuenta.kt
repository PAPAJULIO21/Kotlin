package Cuenta

class Cuenta(val titular:String, cantidad:Double=0.0){
    var cantidad: Double = if (cantidad < 0) 0.0 else cantidad
        private set

    fun ingresar(ingreso:Double){
        if (ingreso > 0){
            cantidad += ingreso
        }else{
            println("Esta cantidad no se permite")
        }
    }
    fun retirar(retirar:Double){
        if (retirar > 0){
            cantidad -= retirar
            if (cantidad < 0){
                cantidad = 0.0
            }
        }else{
            println("Esta cantidad no se permite")
        }
    }
}


fun main(){
    val p = Cuenta("sexo")

    println(p.cantidad)
}