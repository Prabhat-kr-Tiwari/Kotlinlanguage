fun main() {
    var arr= arrayOf(1,2,2)
    for (i in arr){
        println(i)
    }
    //using index
    for((i, e) in arr.withIndex())
    {
        println("$i   $e")
    }
    println(arr[0])
    arr.set(1,9)
    println(arr.get(1))
    println(arr.size)
    println(arr[8])
}