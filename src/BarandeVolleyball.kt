/*
Question title = Barande Volleyball - برنده والیبال
https://quera.ir/problemset/232025/
 */


fun main() {
    val rounds = readln().toInt()

    val result = mutableListOf<String>()

    for (i in 1..rounds) {
        readln()

        var quera = 0
        var codeCup = 0
        readln().forEach {
            if (it == 'Q') quera++ else codeCup++
        }
        val winner = if (quera > codeCup) "Quera" else "CodeCup"
        result.add(winner)
    }

    result.forEach {
        println(it)
    }
}