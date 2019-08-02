import java.math.BigInteger

/**
 * Created by mucahit on 29.07.2017.
 */

fun main(args : Array<String>){

    var result = RecursiveFactorial(BigInteger("100000"), BigInteger.ONE)
    println(result)
}

// The tailrec function for ignoring stack
// The number is stored in Stack but with this keyword
// We can manage manually the stack operation
tailrec fun RecursiveFactorial(num:BigInteger, result:BigInteger):BigInteger{
    if(num == BigInteger.ZERO)
        return result
    return RecursiveFactorial(num - BigInteger.ONE, num * result)
}