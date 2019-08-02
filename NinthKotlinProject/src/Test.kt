/**
 * Created by mucahit on 29.07.2017.
 */

fun main(args : Array<String>){

    var str:String = "4a"

    /*
    var num:Int = 0

    try {
        num = str.toInt()
    }
    catch (e: Exception){
        println(e.message)
    }
    */

    //----------------------------------------
    var num:Int = try {
        str.toInt()
    }
    catch (e: Exception){
        -1
    }

    println(num)
}