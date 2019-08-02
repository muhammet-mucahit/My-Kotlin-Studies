/**
 * Created by mucahit on 29.07.2017.
 */

// It changes TestKt.class file to KotlinFile (name) ;)
@file:JvmName("KotlinFile")

fun main(args : Array<String>){

    sum(10, 15)
    println(sum2(10, 15))
    sum(10, 15)

    var max_num = max(10, 15)

    println(max_num)

    var sum = totalCost(100, 15.0)
    println(sum)

    var sum2 = totalCost(100)
    println(sum2)

    var sum3 = totalCost(kdvRate = 85.0, cost = 50)
    println(sum3)

}

// You don't need to use Unit
// Unit is equal Void
// Every Kotlin functions are static and public. (Default)
fun sum(num1:Int, num2:Int):Unit {
    println(num1 + num2)
}

fun sum2(num1:Int, num2:Int):Int {
    return num1 + num2
}

fun sum3(num1:Int, num2:Int) : Int = num1 + num2

fun max(num1:Int, num2:Int):Int = if(num1 > num2) num1 else num2

@JvmOverloads // For Java (After this the usage is true)
fun totalCost(cost:Int, kdvRate:Double=18.0):Int{

    return (cost + cost * kdvRate/100).toInt()
}


