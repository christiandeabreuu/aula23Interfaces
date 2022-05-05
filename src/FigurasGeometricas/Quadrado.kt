package FigurasGeometricas

class Quadrado ( val lado : Double) : Forma {
    override val forma: String = "Quadrado"

    override fun calcularArea(): Double {
        return lado * lado

    }
}