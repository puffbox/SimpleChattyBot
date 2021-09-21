fun main() {
    // write your code here
    val a1 = readLine()!!.toInt()
    val a2 = readLine()!!.toInt()
    val b1 = readLine()!!.toInt()
    val b2 = readLine()!!.toInt()
    val digit = readLine()!!.toInt()
    println(digit in a1..a2 || digit in b1..b2)
}