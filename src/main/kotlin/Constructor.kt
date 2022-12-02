fun main() {
    var car=Automobile("car","petrol",8)
    val person=Person1()
    println(person.age)
    println(person.name)


}
class  Automobile(val name :String,val type:String ,val maxseating:Int){
    fun driver(){}
    fun applyBrakes(){}
}
class Empty()
class Person1(){


    val name:String=""
    val age:Int=0
}