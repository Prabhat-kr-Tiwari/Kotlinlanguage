fun main() {
  /*  val animal="Dog"
    if (animal=="Horse")
    {
        println("amimal is horse")
    }else if (animal=="cat")
    {
        println("amimal is cat")
    }
    else if (animal=="dog")
    {
        println("amimal is dog")
    }else{
        println("animal not found")
    }*/
    val animal="Dog"
    when(animal){
    "Horse"-> println("Animal is horse")
        "cat"-> println("Animal is cat")
        "Dog"-> println("animal is dog")
    }

    val result= when(animal){
        "Horse" -> "Animal is horse"
        "cat" -> "Animal is cat"
        "dog" -> "animal is dog"
        else->"animal not found"
    }
    println(result)
    val num=13
    val result1=when(num){
        11->"eleven"
        12->"tweleve"
        in 13..19->"teen"
        else->"no not found"
    }
    println(result1)
}