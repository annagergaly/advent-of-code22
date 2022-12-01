fun main() {
    fun part1(input: List<String>): Int {
        val sums = mutableListOf<Int>()
        var sum = 0
        for (line in input) {
            if (line.isBlank()) {
                sums.add(sum)
                sum = 0
            } else {
                sum += line.toInt()
            }
        }
        return sums.max()
    }

    fun part2(input: List<String>): Int {
        val sums = mutableListOf<Int>()
        var sum = 0
        for (line in input) {
            if (line.isBlank()) {
                sums.add(sum)
                sum = 0
            } else {
                sum += line.toInt()
            }
        }
        return sums.sortedDescending().take(3).sum()
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
