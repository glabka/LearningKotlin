package functional_programming

class LambdasExample {

    constructor() {
        println("Lambdas examples:")
    }

    fun run() {
        val list = listOf(1, 2, 3, 4, 5)
        differentNotations(list)
        multiLineLambda(list)
        deconstructionOfDeclaration(mapOf(1 to "one", 2 to "tw"))
    }

    fun differentNotations(list: List<Int>) {
        println(list.any({i : Int -> i > 3}))
        // same as above with omitted type
        println(list.any({i -> i > 3}))
        // same as above when lambda is last argument
        println(list.any() {i -> i > 3})
        // same as above with omitted parenthesis
        println(list.any {i -> i > 3})
        // same as above when there is only one argument
        println(list.any {it > 3})
    }

    fun multiLineLambda(list: List<Int>) {
        println(list.any {
            println("processing $it > 4")
            it > 4
        })
    }

    fun deconstructionOfDeclaration(map: Map<Int, String>) {
        map.forEach { entry -> println("${entry.key} -> ${entry.value}") }
        // different syntax
        map.forEach { (key, value) -> println("$key-> $value") }
        // when only second parameter is required
        map.forEach { (_, value) -> println("val: $value") }
    }
}