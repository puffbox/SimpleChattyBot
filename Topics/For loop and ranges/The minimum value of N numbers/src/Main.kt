fun main() {
    // write your code here
    val digits = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    var min: Int = digits.first()
    for (x in digits) {
        if (x < min) min = x
    }
    println(min)
}