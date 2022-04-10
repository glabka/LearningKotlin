package functional_programming.reference


object ReferenceExample {
    fun run() {
        val acceptLambda = AcceptLambda(2, 3, 4)
        acceptLambda.doSomething(ArgOperatorsImplementation::opArg2Impl)
        acceptLambda.doSomething (ArgOperatorsImplementation::opArg3Impl)
    }
}