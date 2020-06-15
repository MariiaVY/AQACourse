//6. Create a simple class with any 3 fields. Demonstrate in your class how we can use "this" keyword to refer to the object,
// from which a constructor or a method was invoked.

public class thisExample {
   private int number;
   private String name;
   private String surname;

    thisExample (int number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name + " " + surname;
    }

    public static void main(String[] args) {
        thisExample ex = new thisExample(10, "Tom", "Hills");
        System.out.println(ex.getName());
    }
}
