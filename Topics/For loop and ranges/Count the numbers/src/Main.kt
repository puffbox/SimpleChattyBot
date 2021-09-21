fun main() {
    // put your code here
    val (min, max, n) = List(3) { readLine()!!.toInt() }
    var counter: Int = 0
    for (i in min..max) {
        if (i % n == 0) counter++
    }
    println(counter)
}