/**
 * Created by mucahit on 29.07.2017.
 */

fun main (args : Array<String>){

    fun sum(num1:Int, num2:Int):Int{
        return num1 + num2
    }

    var t1 = sum(2, 9)
    println(t1)

    fun mines(num1:Int, num2:Int):Int = num1 - num2

    var m1 = mines(18, 5)
    println(m1)

    fun collect(num1:Int, num2:Int) = num1 * num2
    println(collect(4, 9))

    fun divide(num1:Int, num2:Int) = num1 / num2
    println(divide(num2 = 9, num1 = 108))

    fun nextElements(num:Int):Pair<Int, Int>{
        return Pair(num + 1, num + 2)
    }

    var (firstNumber, secondNumber) = nextElements(17)
    println("Entered: 17, NextOne: $firstNumber, NextTwo: $secondNumber")

    // We don't know how many elements will come to the func.
    // So We need to use vararg key word before a variable
    fun sumNumbers(vararg numbers:Int):Int{
        var sum = 0
        numbers.forEach { i -> sum += i }
        return sum
    }

    println(sumNumbers(1, 2, 3, 4, 5, 6, 7))

    fun factorial(num:Int):Int{

        var fact = 1
        for (i in 1..num){
            fact *= i
        }
        return fact
    }

    println("Factorial of 5 = ${factorial(5)}")
}