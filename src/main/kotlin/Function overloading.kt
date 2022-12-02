fun  main(){
    println(addition(5,6));
   /* println(addition(1.0,6.0));
    //named argument
    println(addition(i=8,i1=8));
    println(addition(i1=1.0,i=6.0));*/
    //storing function in variable
    var fn=::addition
    println(fn(1,3))
}

fun addition(i: Int, i1: Int): Int  {

    return i+i1;
}
/*fun addition(i: Double, i1: Double): Double  {

    return i+i1;
}*/
