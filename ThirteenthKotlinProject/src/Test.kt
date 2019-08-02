/**
 * Created by mucahit on 30.07.2017.
 */

fun main(args : Array<String>){

    println(factorial(5))

    var number1 = 6
    println(number1.factorial2())

    //-------------------------------------------
    var str = "Emre    Altunbilek \t Kotlin"
    println(str)

    println(regulateSpaces(str))

    println(str.regulateSpaces2())

    //-------------------------------------------
    var emre = Student()
    emre.ability = "Java"
    emre.print()

    var hasan = Student()
    hasan.ability = "Android"
    hasan.print()

    var ali = emre.plus(hasan)
    ali.print()

    //-------------------------------------------
    var cemil = emre plus2 hasan
    cemil.print()
}

infix fun Student.plus2(obj:Student):Student{
    var temp = Student()
    temp.ability = this.ability + ", " + obj.ability
    return temp
}

fun Student.plus(obj:Student):Student{
    var temp = Student()
    temp.ability = this.ability + ", " + obj.ability
    return temp
}

fun String.regulateSpaces2():String{

    // Regular Expression
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun regulateSpaces(value:String):String{

    // Regular Expression
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// The function assigned for Int Class ;)
fun Int.factorial2():Int{

    var result = 1

    for (i in 1..this){
        result *= i
    }

    return result
}

fun factorial(num:Int):Int{

    var result = 1

    for (i in 1..num){
        result *= i
    }

    return result
}