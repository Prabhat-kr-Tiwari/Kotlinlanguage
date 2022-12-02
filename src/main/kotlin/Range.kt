fun main() {
    val number=5
    var result=number in 1..5//upper bound included 1 2 3 4 5
    println(result)

    var result1 =number in 1 until 5
    println(result1)
}