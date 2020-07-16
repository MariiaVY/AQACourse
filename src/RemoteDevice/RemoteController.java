package RemoteDevice;

public class RemoteController extends TVDevice {

    boolean isOn = true;

     boolean checkIfDeviceConnected() {
        if (isOn) {
            System.out.println("The Device is connected");
        }
        else {
            System.out.println("The Device is not connected");
        }
         return true;
    }

    void switchTheChannel(int switching) {

    }

    void connectDevice(TVDevice tvDevice) {

    }

    void disconnectDevice() {

    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void setChannel(int channel) {

    }

    @Override
    public void currentChannel() {

    }

    @Override
    public void upVolume() {

    }

    @Override
    public void downVolume() {

    }

    @Override
    public void mute() {

    }
}

