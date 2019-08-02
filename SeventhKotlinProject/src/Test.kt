import java.util.*

/**
 * Created by mucahit on 29.07.2017.
 */

fun main(args : Array<String>){

    // It cannot be changed.
    var numbers = listOf<Int>(1, 2, 3)

    for (i in numbers)
        print("$i ")

    println()

    for ((i, value) in numbers.withIndex())
        println("There is $value in $i. index")

    //------------------------------------------------
    println()

    // It can be changed. Mutable = Degisken
    var ids:MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    ids.add(6)
    ids.remove(3)

    for (i in ids)
        print("$i ")

    //------------------------------------------------
    println()

    var humans = TreeMap<Int, String>()
    humans[123] = "emre altunbilek"
    humans[456] = "ali veli"

    for ((id, name) in humans){
        println("$id ---- $name")
    }

    //------------------------------------------------
    println()


}