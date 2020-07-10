package task5;

public class Main {
    public static void main(String args[]) {
    Rectangle rectangle = new Rectangle(10, 5);
    Triangle triangle = new Triangle(3, 6);
    Circle circle = new Circle();
        System.out.println ("The area of rectangle is " + rectangle.calculateArea());
        System.out.println ("The area of triangle is " + triangle.calculateArea());
        System.out.println ("The area of circle is " + circle.calculateArea());
    }
}
