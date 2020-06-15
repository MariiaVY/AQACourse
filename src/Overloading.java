//10. Create a simple class with overloaded methods. Write another class to demonstrate the concept of methods overloading.

public class Overloading {
    public int multiply(int x, int y)
    {
        return (x * y);
    }
    public double multiply(int x, int y, int z)
    {
        return (x * y * z);
    }

    public static void main(String args[])
    {
        Overloading o = new Overloading();
        System.out.println(o.multiply(2, 5));
        System.out.println(o.multiply(10, 5, 4));
    }

}
