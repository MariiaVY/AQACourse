package RemoteDevice;

public class TV extends TVDevice{
    int volumeLevel;
    int channelNumber;

    public TV(String modelName, boolean isOn) {
        super(modelName, isOn);
    }

    @Override
    public void powerOn() {
        if (isOn()) {
            System.out.println("The device is already turned on");
        } else {
            this.setOn(true);
            System.out.println("The TV is turned on");
        }
    }

    @Override
    public void powerOff() {
        if (isOn()) {
            this.setOn(false);
            System.out.println("The device is turned off");
        } else {
            System.out.println("The device is already turned off");
        }
    }

    @Override
    public void setChannel(int channel) {
        if (!isOn()) {
            System.out.println("setChannel action can't be performed, TV is OFF");
            System.out.println();
            return;
        }
        if (channel >= 0 && channel <= 1000) {
            System.out.println("Channel changed to: " + channel);
            channelNumber = channel;
        } else {
            System.out.println("Invalid channel entered, please choose channel from 0 to 1000 ");
        }
        System.out.println();
    }

    @Override
    public void currentChannel() {
        if (!isOn()) {
            System.out.println("the TV is turned off");
            return;
        }
        System.out.println("The current channel is: " + channelNumber);
    }

    @Override
    public void upVolume() {
        if (!isOn()) {
            System.out.println("the TV is turned off");
            return;
        }
        if (volumeLevel >= 0 && volumeLevel <= 200) {
            volumeLevel++;
            System.out.println("Volume is upper on 1 level");
        } else {
            System.out.println("The maximum volume level is reached");
        }
        System.out.println("The volume is bigger now and it is: " + volumeLevel);
    }

    @Override
    public void downVolume() {
        if (!isOn()) {
            System.out.println("The TV is turned off");
            return;
        }
        if (volumeLevel >= 1 && volumeLevel <= 200) {
            volumeLevel--;
            System.out.println("Volume is lower on 1 level");
        } else {
            System.out.println("The minimum volume level is reached");
        }
        System.out.println("The volume is lower now and it is: " + volumeLevel);
    }

    @Override
    public void mute() {
        if (!isOn()) {
            System.out.println("The TV is turned off");
            return;
        }
        volumeLevel = 0;
        System.out.println("The device is on mute");
    }
}
