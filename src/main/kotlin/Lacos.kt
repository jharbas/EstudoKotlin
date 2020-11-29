
// while e do while é semelhante no java

fun main() {
    for (i in 10 downTo -5 step 3) {
        println(i)
    }

    for (i in -5 until -1) {
        println(i)
    }

    var iterator = ('a'..'c').iterator()
    for((index, value) in iterator.withIndex()) {
        println("No index $index está o valor $value")
    }

    // =================================================================

    val words = "A quick brown fox jumps over the lazy dog".split(" ")
    //convert the List to a Sequence
    val wordsSequence = words.asSequence()

    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
            .map { println("length: ${it.length}"); it.length }
            .take(4)

    println("Lengths of first 4 words longer than 3 chars")
    // terminal operation: obtaining the result as a List
    println(lengthsSequence.toList())

    // =================================================================

    val items = listOf(1, 2, 3, 4, 5)

    items.fold(0, {
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        result
    })

    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })
    val product = items.fold(1, Int::times)

}