fun main(args: Array<String>) {
    dataObjects()
    Parameters().runExample()
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