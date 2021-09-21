fun main() {
    // write your code here
    val digits = IntArray(3) { readLine()!!.toInt() }
    println(digits[0] in digits[1]..digits[2])
}