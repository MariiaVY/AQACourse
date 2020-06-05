//5. Create a simple class with a bunch of constructors. All these constructors should take different number of parameters.
// Demonstrate in your class, how we can call one constructor from another.

public class CallOneConstructorFromAnother {

    public static class Figure {
        int size;
        int height;
        String name;

        public Figure(String name) {
            this.name = name;
            System.out.println("First Constructor");
        }

        public Figure(String name, int size) {
            this(name);
            this.size = size;
            System.out.println("Second Constructor");

        }

        public Figure(String name, int size, int height) {
            this(name, size);
            this.height = height;
            System.out.println("Third Constructor");

        }
    }
        public static void main(String[] args) {
        Figure figure = new Figure("Triangle", 10, 5);
    }
}
