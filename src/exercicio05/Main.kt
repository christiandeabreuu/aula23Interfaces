package exercicio05

fun main() {
    println("Digite o Saldo da Conta corrente")
    var saldoCorrente = readln().toDouble()
    val contaCorrente : Conta = ContaCorrente(saldoCorrente)
    contaCorrente.mostrarSaldo()
    println("--------------------------")

    println("Digite o Saldo da Conta poupança")
    var saldoPoupanca = readln().toDouble()
    val contaPoupanca : Conta = ContaPoupanca(saldoPoupanca)
    contaPoupanca.mostrarSaldo()
    println("--------------------------")

//    println("Digite o Saldo do seguro de vida")
//    var saldoSeguroDeVida = readln().toDouble()
    val seguroDeVida : Conta =  SeguroDeVida (100.00)
    seguroDeVida.mostrarSaldo()
    println("--------------------------")

}