
enum class TipoOrdenador { BASICO, OFIMATICA, TODOTERRENO, GAMING }

open class Articulo(var nombre: String, var precio: Double) {
    private val id: Int = generarId()

    companion object {
        private var totalArticulos = 0
        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    open fun promocionNavidad(descuento: Double) {
        precio -= precio * (descuento / 100)
    }

    override fun toString(): String {
        return "$nombre - %.2f€ (ID: $id)".format(precio)
    }
}

class Ordenador(nombre: String, precio: Double, val tipo: TipoOrdenador = TipoOrdenador.BASICO) 
    : Articulo(nombre, precio) {

    override fun promocionNavidad(descuento: Double) {
        if (precio > 500) {
            super.promocionNavidad(descuento)
        }
    }

    override fun toString(): String {
        return "${super.toString()} - Tipo: $tipo"
    }
}

fun main() {
    val articulo1 = Articulo("Cuaderno", 25.00)
    val articulo2 = Articulo("Mochila", 45.00)
    val ordenador1 = Ordenador("PC Gaming", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Laptop Básico", 399.99, TipoOrdenador.BASICO)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    articulos.forEach { it.promocionNavidad(20.0) }

    articulos.forEach { println(it) }
}
