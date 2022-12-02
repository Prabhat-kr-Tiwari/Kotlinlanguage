fun main() {
    var israining =true
    if (israining==true){
        println(israining)
    }else{
        println("false")
    }
    var x=10
    var y=11
    if (x>y){
        println("x is greater than y")
    }else if (x<y){
        println("x is less than y")
    }else{
        println("x is equal y")
    }
    println("-------------------if else as an expression------------------")
    // if else as an expression
    var result =if(x>y){
        "x is greater than y"
    }else if (x<y){
        "x is less than y"
    }else{
        "x is equal y"
    }
    println(result)

    val num=10
    var result2=if (num%2==0) "Even" else "odd"
}