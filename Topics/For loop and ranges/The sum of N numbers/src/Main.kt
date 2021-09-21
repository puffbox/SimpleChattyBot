fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val digits = IntArray(n) { readLine()!!.toInt() }
    var counter: Int = 0
    for (i in digits) {
        counter += i
    }
    println(counter)
}