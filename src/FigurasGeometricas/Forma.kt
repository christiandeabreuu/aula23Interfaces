package FigurasGeometricas

interface Forma {

    val forma : String

    fun calcularArea(): Double

    fun mostrarInformacoes(){
        println(" A área da $forma é  ${calcularArea()}")
    }
}