interface Conta {
    // propriedade abstrata
    val saldo : Double
    // propriedade implementada
    val valorDeposito : Double
    get() = 10.0

    //metodo abstrato
    fun sacarValor(valorSaque : Double)

    fun depositarValor(valorDeposito : Double){
        if (valorDeposito > 0.0){
            println("Deposito no valor de $valorDeposito")
        }
    }
}

