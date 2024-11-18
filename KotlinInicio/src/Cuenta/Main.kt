package Cuenta

fun main(){
    val p = Cuenta("pepe")
    p.ingresar(5.0)
    println(p.cantidad)
    p.retirar(6.0)
    println(p.cantidad)
}