import java.util.List;

public class Calculator {

    private int a;
    private int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a+b;
    }

    public int minus() {
        return a-b;
    }
}
