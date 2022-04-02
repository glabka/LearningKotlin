package extention_functions

class ExtentionFunctionExample {
    fun run() {
        val parent: Parent = Child()
        // prints parent because extention function translates to static function with argument parameter of class it's
        // extending
        println(parent.foo())
    }
}

open class Parent
// inheritance
class Child: Parent()

fun Parent.foo() = "parent"
fun Child.foo() = "child"
