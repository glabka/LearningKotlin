public class Main {
    public static void main(String[] args) {
        Parameters params = new Parameters();
        // because of @JvmOveloads this overloaded method is created
        params.funWithDefaultParams(4);
    }
}
