import java.math.BigInteger

/**
 * Created by mucahit on 30.07.2017.
 */

fun main(args : Array<String>){

    println(fibonacci(5))
    println(recursive_fibonacci(5))
    println(fibonaciTailRecursive(5, BigInteger.ZERO, BigInteger.ONE))

}

// For now it measures wrong fibonacci.
tailrec fun fibonaciTailRecursive(num:Int, a:BigInteger, b:BigInteger):BigInteger{

    return if(num == 0) b else fibonaciTailRecursive(num - 1, a + b, a)
}

fun recursive_fibonacci(num:Int):Int{
    if(num == 0) return 0
    if(num == 1) return 1
    else return recursive_fibonacci(num - 1) + recursive_fibonacci(num - 2)
}

fun fibonacci(num:Int):Int{

    var a = 0
    var b = 1
    var result = 0

    for (i in 2 .. num){
        result = a + b
        a = b;
        b = result
    }

    return result
}