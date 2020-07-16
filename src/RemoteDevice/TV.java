package RemoteDevice;

public class TV extends TVDevice{
    int volumeLevel;
    int channelNumber;

    @Override
    public void powerOn() {
    }

    @Override
    public void powerOff() {
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("The channel was set to " + channel);
    }

    @Override
    public void currentChannel() {
        System.out.println("The current channel is: ");
    }

    @Override
    public void upVolume() {
        System.out.println("The volume is upper now.");
    }

    @Override
    public void downVolume() {
        System.out.println("The volume is lower now.");
    }

    @Override
    public void mute() {
        System.out.println("The device is muted");
    }
}
