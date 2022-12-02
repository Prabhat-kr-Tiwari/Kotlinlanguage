fun main() {
    var i:Int =20
    println(i.plus(30))
    println(i.toFloat())
    val p1=Person("prabhat",19)
    println(p1.age)
    println(p1.canvote())
}
class Person(val name:String ,val age:Int)
{
    //method
    fun canvote():Boolean{
        return age>18;
    }
}