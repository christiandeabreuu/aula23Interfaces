package exercicio05

class ContaCorrente ( valor : Double ) : Conta (valor), Tributos {
    override val tributos: Double = 0.01 * valor

    init{
        calcularTributos()
    }


    override fun calcularTributos(): Double {
        valor -= tributos
        return valor * 0.01
    }
}