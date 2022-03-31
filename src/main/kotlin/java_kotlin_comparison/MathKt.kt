package java_kotlin_comparison

class MathKt {
    public fun callSum() {
        println(sum(1,2));
        println(sum(num3 = 4)); // cannot do in java
    }

    public fun sum(num1: Int = 0, num2: Int = 0, num3: Int = 0, num4: Int = 0): Int {
        return num1 + num2 + num3 + num4
    }
}