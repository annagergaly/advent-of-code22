fun main() {
    fun part1(input: List<String>): String {
        val stacks = listOf(
            mutableListOf('V', 'J', 'B', 'D'),
            mutableListOf('F', 'D', 'R', 'W', 'B', 'V', 'P'),
            mutableListOf('Q', 'W', 'C', 'D', 'L', 'F', 'G', 'R'),
            mutableListOf('B', 'D', 'N', 'L', 'M', 'P', 'J', 'W'),
            mutableListOf('Q', 'S', 'C', 'P', 'B', 'N', 'H'),
            mutableListOf('G', 'N', 'S', 'B', 'D', 'R'),
            mutableListOf('H', 'S', 'F', 'Q', 'M', 'P', 'B', 'Z'),
            mutableListOf('F', 'L', 'W'),
            mutableListOf('R', 'M', 'F', 'V', 'S')
        )
        input.map { it.removePrefix("move ").split(" from ", " to ").map { it.toInt() }}
             .map {
                 val move = stacks[it[1]-1].take(it[0]).reversed()
                 repeat(it[0]) {_ -> stacks[it[1]-1].removeAt(0) }
                 stacks[it[2]-1].addAll(0, move)
             }
        stacks.map { println(it) }
        return stacks.map { it.first() }.joinToString("")
    }

    fun part2(input: List<String>): String {
        val stacks = listOf(
            mutableListOf('V', 'J', 'B', 'D'),
            mutableListOf('F', 'D', 'R', 'W', 'B', 'V', 'P'),
            mutableListOf('Q', 'W', 'C', 'D', 'L', 'F', 'G', 'R'),
            mutableListOf('B', 'D', 'N', 'L', 'M', 'P', 'J', 'W'),
            mutableListOf('Q', 'S', 'C', 'P', 'B', 'N', 'H'),
            mutableListOf('G', 'N', 'S', 'B', 'D', 'R'),
            mutableListOf('H', 'S', 'F', 'Q', 'M', 'P', 'B', 'Z'),
            mutableListOf('F', 'L', 'W'),
            mutableListOf('R', 'M', 'F', 'V', 'S')
        )
        stacks.map { println(it) }
        input.map { it.removePrefix("move ").split(" from ", " to ").map { it.toInt() }}
            .map {
                val move = stacks[it[1]-1].take(it[0])
                repeat(it[0]) {_ -> stacks[it[1]-1].removeAt(0) }
                stacks[it[2]-1].addAll(0, move)
            }
        return stacks.map { it.first() }.joinToString("")
    }

    val input = readInput("Day05")
    println(part1(input))
    println(part2(input))
}