package FigurasGeometricas

class FormasGeometricas {
    private val formas : ArrayList<Forma> = ArrayList()

    fun calcularEMostrarArea(){
        while (true){
            println("Qual forma deseja adicionar ?\n" +
                    " Quadrado, retângulo, Triângulo ou Losango")
            println("Para mostrar todas as áreas calculadas, Digite 'mostrar' ")
            println("Para sair, digite 'sair' ")
            val opcao = readln().lowercase()

            when(opcao){
                "mostrar" -> {
                    if (formas.isEmpty()) {
                        println("Sem formas cadastradas")
                        println()
                    }else {
                        mostrarTodasAreas()
                    }
                }
                "quadrado" -> {
                    println("Digite o valor da Quadrado:")
                    val base = readln().toDouble()
                    formas.add(Quadrado(base))
                    println()
                }
                "retangulo", "retângulo" -> {
                    println("Digite o valor da base")
                    val base = readln().toDouble()
                    println("Digite o valor da altura:")
                    val altura = readln().toDouble()
                    formas.add(Retangulo(base, altura ))
                    println()
                }
                "triangulo", "triângulo" -> {;
                    println("Digite o valor da base dotriângulo:")
                    val base = readln().toDouble()
                    println("Digite o valor da altura do triângulo:")
                    val altura = readln().toDouble()
                    formas.add(Triangulo(base, altura))
                    println()
                }
                "losango" -> {
                    println("Digite o valor da base do losango:")
                    val base = readln().toDouble()
                    println("Digite o valor da altura do losango:")
                    val altura = readln().toDouble()
                    formas.add(Losango(base, altura))
                    println()
                }
                "sair" -> break
                else -> println("Opção inválida. \n" +
                        "Digite novamente")

            }
        }
    }
    fun mostrarTodasAreas(){
        println("Área das formas:")
        formas.forEach{
            it.mostrarInformacoes()
            println("--------------")
            println()
        }
    }
}