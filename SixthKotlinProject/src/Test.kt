/**
 * Created by mucahit on 29.07.2017.
 */


fun main(args : Array<String>){

    var numbers = 1..10

    for (i in numbers.reversed().step(2))
        print("$i ")

    //---------------------------------------------
    println()

    for (i in numbers){
        print("$i ")
        if(i == 5)
            break;
    }

    //---------------------------------------------
    println()

    // The name of first for is DistantFor.
    // It has name.
    DistantFor@ for(i in 1..3){
        for(j in 1..3){
            println("$i $j")
            if(i == 2 && j == 1)
                break@DistantFor
        }
    }

    //---------------------------------------------
    println()

    for(i in numbers){
        if(i == 5)
            continue
        println(i)
    }
}