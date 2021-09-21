// write your function here
fun isVowel(letter: Char) = letter in "aeiouAEIOU"

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}