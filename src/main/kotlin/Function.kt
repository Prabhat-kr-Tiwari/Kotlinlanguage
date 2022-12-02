fun main() {
    /*val result=add(5,6)
    print(result)
    val result2=add(89,4)
    print(result2)
    evenorodd(2)*/
    printmessage(1)

}
fun printmessage(count:Int=2){

    for (i in 1..count){
        println("Hello $i")
    }
}
/*fun add(num1:Int ,num2:Int):Int{
    val sum=num1+num2
    return sum



}*/
fun evenorodd(num1:Int)
{
    val result =if(num1%2==0){
        println("even")
    }else{
        println("odd")
    }

    println(result)
}
//inline function
fun add(num1:Int ,num2:Int):Int =num1 +num2

