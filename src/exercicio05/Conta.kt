package exercicio05

abstract class Conta (var valor : Double) {
    fun mostrarSaldo(){
        println("Saldo em conta após desconto tributário: $valor ")

    }

}