package task1;

public class C {
    private String c1;

    C() {
        System.out.println("Composition C");
        c1 = "The Second Word";
    }

    @Override
    public String toString() {
        return c1;
    }
}
