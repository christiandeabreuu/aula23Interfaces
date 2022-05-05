package FigurasGeometricas

class Retangulo ( val base : Double, val altura : Double) : Forma {
    override val forma: String = "Retângulo"

    override fun calcularArea() : Double {
        return base * altura

    }
}