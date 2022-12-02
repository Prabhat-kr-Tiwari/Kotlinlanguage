fun main() {

    val mustang=car("mustange ", "petrol",100)
    println(mustang.drivecar())
    println(mustang.name)
}
class  car(val name:String ,val type :String,var km:Int)
{
    fun drivecar(){
        println("$name Car is driving");
    }
    fun applybrakes(){
        print("applied brakes")
    }
}
