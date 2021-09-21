fun main() {
    // write your code here
    val (min, max) = IntArray(2) { readLine()!!.toInt() }
    for (i in min..max) {
        if (i % 3 == 0) {
            if (i % 5 == 0) println("FizzBuzz") else println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}