import Beer.*

fun usandoWhen(beer:Beer) = when (beer) {
    ROLETA_RUSSA -> "Roleta Russa"
    GUINNESS -> "Guinness"
    INDICA -> "Indica"
}

fun isCervejaEscura(beer:Beer) = when (beer) {
    GUINNESS -> "Sim"
    ROLETA_RUSSA, INDICA -> "Não"
    else -> throw Exception("bla bla bla")
}

fun main() {
    println(usandoWhen(ROLETA_RUSSA))
    println("${usandoWhen(ROLETA_RUSSA)} é uma cerveja escura? ${isCervejaEscura(ROLETA_RUSSA)}")
}