fun main() {
    var count =5;
    while (count>=1)
    {
        println(count);
        count--;
    }
    //table
    var number =2;
    var index=1;
    while (index<=10)
    {
        println(number*index)
        index++
    }
    //here the counter every time increase by 1
    for(i in 1..5){
        println(i)
    }

    println("increase the counter by 2 times")
    for(i in 1..5 step 2){
        println(i)
    }
    println("until")
    for (i in 1 until 5)
    {
        println(i)
    }


    //using the downto
    for (i in 10 downTo 1 step 2)
    {
        println(i)
    }
    println("table of two")
    val numbers =2
    for (i in 1 ..10)
    {
       // println(numbers.toString() + "*" + i +  "="+ (numbers*i))
        //string templating
        println( "$numbers * $i = ${numbers*i}")
    }
}