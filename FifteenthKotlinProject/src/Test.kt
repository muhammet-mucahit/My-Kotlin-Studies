/**
 * Created by mucahit on 30.07.2017.
 */

// All classes and interfaces are public as default.
interface operation {
    fun sum(n1:Int, n2:Int) { println("Sum: ${n1 + n2}")}
    fun divide(n1:Int, n2:Int) { println("Divide: ${n1 / n2}")}
}

class UserOperations : operation {
    override fun sum(n1: Int, n2: Int) {
        println(n1 + n2)
    }

    override fun divide(n1: Int, n2: Int) {
        println(n1 / n2)
    }
}

class AdminOperations : operation {
    override fun sum(n1: Int, n2: Int) {
        println(n1 + n2 + 10)
    }

    override fun divide(n1: Int, n2: Int) {
        println(n1 / n2 + 10)
    }
}

class EmreOperation:operation{

}

fun main(args:Array<String>) {

    var user:UserOperations = UserOperations()
    user.sum(5, 8)

    var admin = AdminOperations()
    admin.sum(5, 8)

    var emre = EmreOperation()
    emre.sum(5, 8)
}