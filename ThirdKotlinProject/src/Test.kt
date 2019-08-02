/**
 * Created by mucahit on 28.07.2017.
 */

fun main(args : Array<String>){

    var number1:Int = 5
    var number2 = 35
    var result:Int = 0

    if(number1 > number2){
        println("Number1 greater than Number2")
    }
    else{
        println("Number2 greater than Number1")
    }

    result = if(number1 > number2)
        number1
    else if(number2>number1)
        number2
    else 0

    println("Maximum number $result")

    // ----------------------------------------------------------------------------

    var str1:String = "Emre"
    var str2:String = "emre"

    if(str1.equals(str2))
        println("They are equal")
    else
        println("They are different")

    // The 'true' value is for IgnoreCase
    // Namely Emre and emre will be equal
    if(str1.equals(str2, true))
        println("They are equal")
    else
        println("They are different")

    if(str1 == str2)
        println("They are equal")
    else
        println("They are different")

    // ----------------------------------------------------------------------------

    val emre = Student()

    println(emre.name)

    // Null point exception
    //println(emre.name.length)

    val hasan = StudentKotlin()

    // The question mark says that it can be null.
    println(hasan.name?.length)

    // The '!!' forces it.
    //println(hasan.name!!.length)

    val no:Int? = null
    println("Number $no")

}