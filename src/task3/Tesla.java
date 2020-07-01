package task3;

public class Tesla extends Car {

    public Tesla(String name, String size) {
        super(name, size);
    }

    public static void main(String args[]) {

        Tesla t = new Tesla("X", "Large");
        System.out.println("Number of seats is " + t.numberOfSeats());
        t.move(220, 45);
        t.steer(70);
        System.out.println(t.getCurrentDirection());
        System.out.println(t.getCurrentVelocity());
        System.out.println("The Name is " + t.getName());
        System.out.println("The size is " + t.getSize());
        t.stop();
    }
}
