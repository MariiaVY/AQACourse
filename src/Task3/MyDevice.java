//Create two interfaces Volume and State. Create a new class "MyDevice" which
// implements both interfaces. Provide your implementations of methods.

package Task3;

public class MyDevice implements Volume, State {

    @Override
    public void on() {
    System.out.println("The device is turned on.");
    }

    @Override
    public void off() {
        System.out.println("The device is turned off.");
    }

    @Override
    public void changeVolume(double value) {
        System.out.println("The volume is changed to " + value);
    }
}
