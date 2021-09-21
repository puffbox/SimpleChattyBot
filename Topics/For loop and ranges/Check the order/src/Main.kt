import java.util.*

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val n = readLine()!!.toInt()
    var min = Int.MIN_VALUE
    var string = "YES"
    for (i in 1..n) {
        val digit = scanner.nextInt()
        if (min > digit) {
            string = "NO"
            break
        } else {
            min = digit
        }
    }
    println(string)
}