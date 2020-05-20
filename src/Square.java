import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        int h = 5;
        int a = 2;
        int RectangleArea = h * a;

        int radius = 4;
        double CircleArea = Math.pow(radius,2)* Math.PI;
        int i =(int) Math.round(CircleArea);

        System.out.println("Area of Rectangle is: " + RectangleArea);
        System.out.println("Area of Circle is: " + i);

    }
}
