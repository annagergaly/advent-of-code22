fun main() {
    fun part1(input: List<String>): Int {
        return input.map {
            val n = it.split("[,-]".toRegex()).map { it.toInt() }
            (n[0] <= n[2] && n[1] >= n[3]) || (n[2] <= n[0] && n[3] >= n[1])
        }.count { it }
    }

    fun part2(input: List<String>): Int {
        return input.map {
            val n = it.split("[,-]".toRegex()).map { it.toInt() }
            (n[0] in n[2]..n[3]) || (n[1] in n[2]..n[3]) || (n[2] in n[0]..n[1]) || (n[3] in n[0]..n[1])
        }.count { it }
    }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}