fun main() {
    fun part1(input: List<String>): Int {
        var set : Set<Char> = setOf()
        var offset = 0
        while (set.size != 4) {
            set = input[0].toCharArray().toList().drop(offset).take(4).toSet()
            offset++
        }
        return offset+3
    }

    fun part2(input: List<String>): Int {
        var set : Set<Char> = setOf()
        var offset = 0
        while (set.size != 14) {
            set = input[0].toCharArray().toList().drop(offset).take(14).toSet()
            offset++
        }
        return offset+13
    }

    val input = readInput("Day06")
    println(part1(input))
    println(part2(input))
}