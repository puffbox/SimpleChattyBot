// write your code here
fun isRightEquation(digit1: Int, digit2: Int, digit3: Int) = digit1 * digit2 == digit3
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}