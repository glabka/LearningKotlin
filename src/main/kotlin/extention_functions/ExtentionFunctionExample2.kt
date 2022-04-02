package extention_functions

class ExtentionFunctionExample2 {
    fun run() {
        val str = "abc"
        // extention function get won't override member function
        println(str.get(0))
        // member function
        println(str.toString())
        // extention function overloads member function (has different arguments or their number) thus will be called
        println(str.toString(3))
    }
}

fun String.get(index: Int) = "*"
fun String.toString() = "&"
fun String.toString(num: Int) : String {
    val s = StringBuilder()
    for(i in 0..num) {
        s.append(this)
    }
    return s.toString()
}