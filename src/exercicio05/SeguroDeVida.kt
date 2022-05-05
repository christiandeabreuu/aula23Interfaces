package exercicio05

class SeguroDeVida( valor : Double) :Conta(valor), Tributos {
    override val tributos: Double = 42.0


    init {
        calcularTributos()
    }
    override fun calcularTributos() : Double {
        valor -= 42.00
        return 42.00

    }
}