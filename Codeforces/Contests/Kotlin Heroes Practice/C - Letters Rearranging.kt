fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val s = readLine()!!.toCharArray()
        s.sort()
        if (s.first() == s.last()) {
            println(-1)
        } else println(String(s))
    }
}
