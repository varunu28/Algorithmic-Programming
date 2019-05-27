fun main() {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    val (green, purple, black) = readLine()!!.split(" ").map { it.toInt() }

    var condition = true

    if (!(green >= x && green - x + purple >= y && green - x + purple - y + black >= z)) {
        condition = false
    }

    println(if (condition) "YES" else "NO")
}
