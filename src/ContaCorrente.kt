class ContaCorrente: Conta {

    override val saldo: Double = 0.0
        get() = field

    override val valorDeposito : Double
        get() = 10.0

    override fun sacarValor(valorSaque: Double) {
        println("Saque no valor de: $valorSaque na CC")
    }

}