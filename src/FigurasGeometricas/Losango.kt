package FigurasGeometricas

class Losango( private val base : Double,  private val altura : Double) : Forma {
    override val forma: String = "Losango"

    override fun calcularArea() : Double {
        return base * altura

    }
}