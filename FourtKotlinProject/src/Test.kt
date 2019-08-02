/**
 * Created by mucahit on 28.07.2017.
 */

fun main(args : Array<String>){

    val x:Int = 5

    val str:String

    // The structure is equal the Switch-Case structure
    when(x){
        5 ->{
            println("The entered number is 5")
            str = "The entered number is 5"
        }
        9 -> str = "The entered number is 8"
        10 -> println("The entered number is 10")
        in 11..20 -> println("The entered number is between 11 and 20")
        !in 21..30 -> println("The entered number is not between 21 and 30")
        else -> println("Unknown number was entered")
    }

    // The str should be initialized with a value.
    // It prevents null point exception
    //println(str)

    //------------------------------------------------------------------------------
    val number:Int = 10

    var result:String = when(number){
        10 -> "The entered number is 10"
        100 -> "The entered number is 100"
        else -> "Unknown number was entered"
    }

    println(result)
}