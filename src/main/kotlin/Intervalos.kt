fun main() {
    val aToF = "a".."f"
    val oneToHundred = 1.rangeTo(100)
    println("b" in aToF)
    println("t" in aToF)
    println(90 in oneToHundred)
    println(105 in oneToHundred)

    val testeStepImpar = 1.rangeTo(10).step(2)
    println(4 in testeStepImpar)
    println(9 in testeStepImpar)

    teste(20)
    teste(150)
}

fun teste(valor: Int) {
    when (valor) {
        in 1.rangeTo(100) -> println("Faixa 1")
        in 101..200 -> println("Faixa 2")
    }
}