/**
 * Created by mucahit on 28.07.2017.
 */

fun main(args : Array<String>){
    println("Hello World!")

    var number1 = 10
    var number2 = 20

    val number3 = 40

    number1 = 5
    //number3 = 10 // It cannot be assigned again. // Java Final

    println("Number1: $number1 and Number3: " + number3 + " and Number2: $number2")

    // ----------------------------------------------------------------------------
    var maxInt:Int = Int.MAX_VALUE
    var minInt:Int = Int.MIN_VALUE

    println("Maximum integer value $maxInt")
    println("Minimum integer value " + minInt)

    if(maxInt is Int){
        println("" + maxInt + " is a integer variable.")
    }

    // ----------------------------------------------------------------------------
    var letter:Char = 'A'
    println("Is A a char variable?: ${letter is Char}")
    println(letter.toInt())

    // ----------------------------------------------------------------------------
    var name = "Emre"
    val surname:String = " Altunbilek"
    var fullname = name + surname

    println("$name $surname")
    println(fullname)
}