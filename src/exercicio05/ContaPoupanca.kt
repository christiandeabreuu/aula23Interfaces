package exercicio05

class ContaPoupanca ( valor : Double) : Conta(valor), Tributos {
    override val tributos: Double = 0.0

    init{
        calcularTributos()
    }

    override fun calcularTributos(): Double {
        return tributos
    }

}