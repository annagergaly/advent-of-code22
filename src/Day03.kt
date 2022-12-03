fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf {
            val sets = it.chunked(it.length / 2).map { it.toSet() }
            sets[0].intersect(sets[1]).sumOf {
               it.priority()
            }
        }
    }

    fun part2(input: List<String>): Int {
        return input.chunked(3).sumOf {
            it[0].toSet().intersect(it[1].toSet()).intersect(it[2].toSet()).first().priority()
        }
    }

    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}

fun Char.priority(): Int {
     return if (isLowerCase())
        this - 'a' + 1
    else
        this - 'A' + 27
}