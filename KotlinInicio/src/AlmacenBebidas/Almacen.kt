package AlmacenBebidas

class Almacen {
    val estanterias: Array<Array<Bebida?>> = Array(5) { Array(5) { null } }

    fun agregarBebida(bebida: Bebida): Boolean {
        if (buscarBebidaPorId(bebida.id) != null) {
            println("La bebida con ID ${bebida.id} ya existe en el almacén.")
            return false
        }

        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
                if (estanterias[i][j] == null) {
                    estanterias[i][j] = bebida
                    return true
                }
            }
        }
        println("El almacén está lleno. No se puede agregar la bebida.")
        return false
    }

    fun eliminarBebida(id: Int): Boolean {
        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
                // Imprimir los valores de i, j y la bebida en la posición
                println("Verificando posición ($i, $j): ${estanterias[i][j]?.id}")

                if (estanterias[i][j]?.id == id) {
                    estanterias[i][j] = null
                    println("Bebida con ID $id eliminada de la posición ($i, $j).")
                    return true
                }
            }
        }

        println("No se encontró una bebida con ID $id en el almacén.")
        return false
    }
    // Método para calcular el precio total de todas las bebidas en el almacén
    fun calcularPrecioTotal(): Double {
        var total = 0.0
        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
                if (estanterias[i][j] != null) {
                    total += estanterias[i][j]?.precio ?: 0.0
                }
            }
        }
        return total
    }

    // Método para calcular el precio total de todas las bebidas de una marca específica
    fun calcularPrecioPorMarca(marca: String): Double {
        var total = 0.0
        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
                if (estanterias[i][j]?.marca == marca) {
                    total += estanterias[i][j]?.precio ?: 0.0
                }
            }
        }
        return total
    }

    // Buscar bebida por ID
    fun buscarBebidaPorId(id: Int): Bebida? {
        for (i in estanterias) {
            for (bebida in i) {
                if (bebida?.id == id) {
                    return bebida
                }
            }
        }
        return null
    }

    // Mostrar todas las bebidas en el almacén
    fun mostrarBebidas() {
        for (fila in estanterias) {
            for (bebida in fila) {
                if (bebida != null) {
                    println(bebida.id)
                } else {
                    println("Vacío")
                }
            }
            println("---------")
        }
    }

    // Método para calcular el precio total de una columna específica
    fun calcularPrecioColumna(columna: Int): Double {
        var total = 0.0
        // Validamos que la columna esté dentro de los límites
        if (columna !in estanterias[0].indices) {
            println("Columna $columna fuera de rango.")
            return 0.0
        }

        // Recorremos todas las filas de la columna indicada
        for (i in estanterias.indices) {
            val bebida = estanterias[i][columna]
            if (bebida != null) {
                total += bebida.precio
            }
        }
        return total
    }
}
