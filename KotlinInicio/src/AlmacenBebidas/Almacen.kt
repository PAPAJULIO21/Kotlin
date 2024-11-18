package AlmacenBebidas

class Almacen {
    private val estanterias = Array(5) { arrayOfNulls<Bebida?>(5) }

    // Agregar bebida
    fun agregarBebida(bebida: Bebida): Boolean {
        if (buscarBebidaPorId(bebida.id) != null) {
            println("La bebida con ID ${bebida.id} ya existe en el almacén.")
            return false
        }

        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
                if (estanterias[i][j] == null) {
                    estanterias[i][j] = bebida
                    println("Bebida con ID ${bebida.id} agregada en la posición ($i, $j).")
                    return true
                }
            }
        }
        println("El almacén está lleno. No se puede agregar la bebida.")
        return false
    }

    // Eliminar bebida por ID
    fun eliminarBebida(id: Int): Boolean {
        for (i in estanterias.indices) {
            for (j in estanterias[i].indices) {
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

    // Buscar bebida por ID
    private fun buscarBebidaPorId(id: Int): Bebida? {
        for (fila in estanterias) {
            for (bebida in fila) {
                if (bebida?.id == id) return bebida
            }
        }
        return null
    }

    // Mostrar todas las bebidas en el almacén
    fun mostrarBebidas() {
        for (fila in estanterias) {
            for (bebida in fila) {
                if (bebida != null) {
                    bebida.toString()
                } else {
                    println("Vacío")
                }
            }
            println("---------")
        }
    }
}
