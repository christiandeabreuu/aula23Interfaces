class ContaPoupanca : Conta {
    override val saldo: Double
        get() = 40.0

    override fun sacarValor(valorSaque: Double) {
        println("Saque na poupana no valor de $valorSaque")
    }
}