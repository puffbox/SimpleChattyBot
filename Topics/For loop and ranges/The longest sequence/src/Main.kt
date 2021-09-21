fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var max: Int = Int.MIN_VALUE
    var counter: Int = 0
    var realCounter: Int = 0
    for (i in 1..n) {
        val digit = readLine()!!.toInt()
        if (digit >= max) {
            max = digit
            counter++
        } else {
            max = digit
            counter = 1
        }
        if (counter > realCounter) realCounter = counter
    }
    println(if (counter > realCounter) counter else realCounter)
}