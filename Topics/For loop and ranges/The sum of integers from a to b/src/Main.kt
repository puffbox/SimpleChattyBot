fun main() {
    // put your code here
    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()
    var counter: Int = 0
    for (i in min..max) {
        counter += i
    }
    println(counter)
}