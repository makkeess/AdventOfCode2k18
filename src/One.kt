import java.io.File
import java.lang.Integer.parseInt
import java.util.stream.Collectors

fun main() {
    val fileName = "C:\\Users\\marjon4\\IdeaProjects\\AdventOfCode\\resources\\DayOne.txt"

    val integers = File(fileName).readLines().stream()
        .map { line -> parseInt(line) }
        .collect(Collectors.toList())
    val seqRepeat = findFirstFreqRepeat(integers)
    println("First found was $seqRepeat")
}

fun findFirstFreqRepeat(integers: List<Int>) : Int {
    var setOfUsedFreqs = HashSet<Int>()
    var freq = 0

    while (true) {
        integers.forEach {
            freq += it
            if (setOfUsedFreqs.contains(freq)) {
                println("Reached $freq")
                return freq
            } else {
                setOfUsedFreqs.add(freq);
            }
        }
    }
}