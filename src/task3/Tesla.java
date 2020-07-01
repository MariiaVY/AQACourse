//3) Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create another class, a specific type of Car that inherits from the Car class. You should be able to hand steering, changing gears, and moving(speed in other words). You will want to decide where to put the appropriate state and behaviours(fields and methods).
//As mentioned above, changing gears, increasing/decreasing speed should be included. For you specific type of vehicle you will want to add something specific for that type of car.

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
