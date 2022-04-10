package functional_programming.reference
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3

class AcceptLambda(private val a: Int, private val b: Int, private val c: Int) {
    @JvmName("doSomething1") // otherwise declarations have same jvm signature
    fun doSomething(kFunction2: KFunction2<Int, Int, Int>) {
        println(kFunction2(a, b))
    }

    fun doSomething(kFunction3: KFunction3<Int, Int, Int, Int>) {
        println(kFunction3(a, b, c))
    }

}