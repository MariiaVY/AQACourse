package task1;

public class A {
    String a;

    A() {
    System.out.println("Composition A");
    a = "New Word";
}
    @Override
    public String toString() {
        return a;
    }
}
