class Parameters(private val num : Int = 42) {

    fun runExample() {
        println(num)
        funWithDefaultParams();
        // calling of fun with firt param specified
        funWithDefaultParams(1)
        // calling of fun with second param specified
        funWithDefaultParams(text = "param text")
    }

    // parameters are var by default, val is not acceptable
    @JvmOverloads // forces kotlin compiler to implement all overloaded methods for calling of function with less params
    fun funWithDefaultParams(num: Int = -3, text: String = "defaultText") {
        println("num: $num, text: $text")
    }
}