package FigurasGeometricas

class Triangulo( val base : Double, val altura : Double) : Forma {
    override val forma: String = "Triângulo"

    override fun calcularArea(): Double {
        return base * altura / 2

    }
}