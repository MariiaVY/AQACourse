package task1;

public class B {
    private String b1;

    B() {
        System.out.println("Composition B");
        b1 = "The First Word";
    }

    @Override
    public String toString() {
        return b1;
    }
}
