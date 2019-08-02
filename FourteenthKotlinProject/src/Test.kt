/**
 * Created by mucahit on 30.07.2017.
 */

fun main(args : Array<String>){

    val t1 = Title("Title 1")
    val t2 = Title("Title 2")
    val t3 = t1.plus1(t2)
    val t4 = t1 plus2 t2
    val t5 = t1 + t2

    println(t3.value)
    println(t4.value)
    println(t5.value)

}

class Title(var value:String){}

// The plus is key value.
operator infix fun Title.plus(t:Title):Title{
    return Title(this.value + " " +  t.value)
}

infix fun Title.plus2(t:Title):Title{
    return Title(this.value + " " +  t.value)
}

fun Title.plus1(t:Title):Title{
    return Title(this.value + " " +  t.value)
}