//10) How can you create a constant in Java, that will be available for everyone outside your class or package?
// -  public static final int (constant) will be available for everyone outside my class or package.

//11) Create a class with two different methods and two fields. One of methods should be static, another - non-static.
// The same thing should be done with class fields(first - static, second - non-static). These two methods should change
// the corresponding fields of the class when called. Create another class with main method to test your code.

package task_10_11;
public class MyClass {

    static int a;
    int b;

    static void change(int value) {
        System.out.println(a + 3);
        // should change corresponding field
    }

    void anotherChange(int value) {
        this.b = value;
        System.out.println(b - 1);
        // should change corresponding field
    }
    public static void main(String[] args) {
        change(a);
        MyClass m = new MyClass();
        m.anotherChange(5);
    }
}
