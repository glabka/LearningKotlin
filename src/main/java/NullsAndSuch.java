import org.jetbrains.annotations.NotNull;

public class NullsAndSuch {

    public static void main(String[] args) {
        getStringNotNull(); // throws runtime exception
        getStringNotNull2(); // does not throw runtime an exception
    }

    @NotNull // jetbrains annotation
    public static String getStringNotNull() {
        return null;
    }

    @javax.validation.constraints.NotNull //javax not null
    public static String getStringNotNull2() {
        return null;
    }
}
