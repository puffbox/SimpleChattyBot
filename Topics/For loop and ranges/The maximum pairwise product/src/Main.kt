fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    val digit = IntArray(n) { readLine()!!.toInt() }
    var max: Int = 0
    var secondMax = 0
    for (x in digit) {
        if (x > max) {
            max = x
        } else if (x in secondMax until max || x == max) {
            secondMax = x
        }
    }
    if (n == 1) {
        println(max)
    } else {
        println(secondMax * max)
    }
}