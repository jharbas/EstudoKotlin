/*
Classe Kotlin criada atraves da conversao da seguinte classe java:

public class Cliente {
    private final String name;

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
 */

// OBS como o parametro name não tem o set, ele foi criado no kotlin como val, se tivesse, seria criado como var
class Cliente(val name: String)

fun main() {

    var cliente = Cliente("fulano")
    println(cliente.name)

    // usando a classe java
    var teste = TesteClasseJava("1", "2")
    println(teste.teste1)

    // este é o nome do metodo get e não do parametro, provando que continua tendo o encapsulamento
    println(teste.teste2GetModificado)

}