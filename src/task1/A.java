package task1;

public class A {
    private String a1, a2;
    private B b = new B();
    private C c = new C();

    @Override
    public String toString() {
        return "a1 = " + a1 +
                " a2 = " + a2 +
                " b = " + b +
                " c = "  + c;
    }
}
