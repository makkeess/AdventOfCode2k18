import java.io.File
import java.util.stream.Collectors

fun main() {
    val fileName = "C:\\Users\\marjon4\\IdeaProjects\\AdventOfCode\\resources\\DayTwo.txt"
    val lines = File(fileName).readLines().stream().collect(Collectors.toList())
    partOne(lines)

}

fun partOne(lines: List<String>) {
    var twice = 0
    var thrice = 0
    lines.forEach {
        val map = mutableMapOf<Char, Int>()
        it.forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        println(map)
        if (map.containsValue(2)) {
            twice = twice.inc()
        }
        if (map.containsValue(3)) {
            thrice = thrice.inc()
        }
    }
    println("Twice was: $twice")
    println("Thrice was: $thrice")
    println("Checksum: ${twice * thrice}")
}