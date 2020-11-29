import kotlin.reflect.typeOf

fun main() {

    // utilizar var para variaveis e val para valores imutáveis,
    // mas se o val receber um objeto mutavel, uma lista por exemplo,
    // então é possível modificar essa lista, só não é possível fazer novas atribuições
    val melhorDiaSemana = "sexta"

    val numeros = arrayListOf("Um", "Dois")
    numeros.add("Três")
    println(numeros)

    // se o valor da variavel ja for atribuido no momento de sua declaracao, o tipo pode ser omitido
    var exemplo1:Double = 46.5
    var exemplo2 = 46.2

    // se a variavel for declarada sem setar o um valor, entao o ditpo precisa obrigatoriamente ser especificado
    var xpto:Int
    xpto = 30

    println("Hello World")
    println(somaContaLuzAgua(12.3,20.5))

    // uso de templates, $SUA_VARIAVEL ou ${TRECHO DE CODIGO}
    println("Teste numeros = $numeros, e ${somaContaLuzAgua2(14.3,24.5)} - OK")

    println(somaContaLuzAgua3())
    println(somaContaLuzAgua3(5.0))
    println(somaContaLuzAgua3(agua = 9.0))
}

/**
 * Função com corpo de bloco
 * - o tipo de retorno deve ser especificado
 */
fun somaContaLuzAgua(luz:Double, agua:Double):Double{
    return luz+agua
}

/**
 * Função com corpo de expressão
 * - não precisa declarar o tipo do retorno
 */
fun somaContaLuzAgua2(luz:Double, agua:Double) = luz+agua

/**
 * Função com valores default nos parametros (tipo o python)
 */
fun somaContaLuzAgua3(luz:Double = 2.0, agua:Double = 3.5) = luz+agua