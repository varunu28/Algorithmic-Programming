fun main() {
    val (yellow, blue, red) = readLine()!!.split(" ").map { it.toInt() }
    println(minOf(yellow, blue - 1, red - 2) * 3 + 3)
}
