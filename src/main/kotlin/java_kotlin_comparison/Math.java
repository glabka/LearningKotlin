package java_kotlin_comparison;

public class Math {

    public void callSum() {
        System.out.println(sum(1, 2));
    }

    public int sum(int num1, int num2) {
        return sum(num1, num2, 0);
    }

    public int sum(int num1, int num2, int num3) {
        return sum(num1, num2, num3, 0);
    }


    public int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
