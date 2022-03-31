// top level function (not in class) -> translates to static function
fun main(args: Array<String>) {
    dataObjects()
    Parameters().runExample()
    expressions(true, "hi")
    funWithLocalFun()
}

fun funWithLocalFun() {
    fun localFun(text: String = "default text") {
        println(text)
    }
    localFun()
    localFun("different text")
}

fun expressions(myBool: Boolean, text: String) : Unit { // Unit is like void but can be omitted
    // if as expression
    val value = if (myBool)"hello" else "hi"

    // if as expression - last command is returned
    val value2 = if (myBool) {
        println("do something")
        myBool
    } else {
        println("do something else")
        myBool
    }

    // when as expression (notice different variables used in body of when)
    val value3: String = when {
        text == "hello" -> "it said hello"
        text == "hi" -> "it said hi"
        value2 -> "value2 was true"
        else -> "it said something else"
    }

    // when as expression (returns two values)
    val (value4, value5) = when {
        myBool -> Pair(1, "some text")
        else -> 2 to "some other text" // different notation for Pair
    }
    println(value4)


}

fun dataObjects() {
    val text: String = "my text"
    // unmutable data class
    val someData = DataClass(4, text)
    val someOtherData = DataClass(4, text)
    println(someData.num);
    println(someData.equals(someOtherData)) // true
    println(someData == someOtherData) // true

    // mutable data class
    val mutableData = DataClass2("text");
    println(mutableData.text)
    mutableData.text = "new text"
    println(mutableData.text)
}

enum class MyEnum {
    FIRST, SECOND;
    fun enumFun(myVar: MyEnum) {
        // when subject variable used, else can be omitted since it is enum
        val myConstant = when(val myEnumVal: MyEnum = myVar) {
            FIRST -> "FIRST enum item"
            SECOND -> "SECOND enum item"
        }
        // else has to be present in this case
        val myConstant2 = when (val myVar: String = "string") {
            is String -> true
            else -> false
        }
    }
}