/**
 * Created by mucahit on 29.07.2017.
 */

fun main(args : Array<String>) {

    // numbers = 1, 2, 3, 4, 5
    var numbers1 = 1..5

    // numbers = 5, 4, 3, 2, 1
    var numbers2 = 5..1

    var letters = 'a'..'z'

    var IsInclude = 'c' in letters

    when (IsInclude) {
        true -> println("Yes, The letters include 'c'.")
        false -> println("No, The letters don't include 'c'.")
    }

    //-----------------------------------------------------------

    //TwoStepNumbers = 1, 3, 5, 7, 9 ...
    var TwoStepNumbers = 1..100 step 2

    var CountDown = 100.downTo(1) // = 100 .. 1
    var CountForward = 1.rangeTo(100).step(8) // 1, 9, 17 ...

    //-----------------------------------------------------------

    for (i in 1..10) {
        print("" + i + " ")
    }

    println()
    
    for (i in letters) {
        print("" + i + " ")
    }

    //-----------------------------------------------------------
    println()
    var i:Int = 0
    while(i < 10){
        print("" + i + " ")
        i++
    }

    //-----------------------------------------------------------
    println()
    var j:Int = 0
    do {
        print("" + j + " ")
        j++
    }
    while (j < 10)
}