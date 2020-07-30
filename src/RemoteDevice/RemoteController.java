package RemoteDevice;

public class RemoteController implements Volume, Device {
    private TVDevice tvDevice;

    public RemoteController(TVDevice myTvDevice) {
        this.tvDevice = myTvDevice;
        System.out.println(tvDevice.getModelName() + " is connected");
    }

    public void сonnectDevice(TVDevice myTvDevice) {
        if (myTvDevice.equals(this.tvDevice)) {
            System.out.println(tvDevice.getModelName() + "  device is already connected");
        }
        else {
            if (this.tvDevice == null) {
                this.tvDevice = myTvDevice;
                System.out.println(this.tvDevice.getModelName() + " device is connected");
            } else {
                System.out.print(this.tvDevice.getModelName() + " device disconnected and a new one is connected");
                this.tvDevice = myTvDevice;
                System.out.println(this.tvDevice.getModelName() + " a new device is connected");
            }
        }
    }

     boolean checkIfDeviceConnected() {
         System.out.println();
         if (tvDevice != null) {
             return true;
         } else {
             System.out.println(" There is no connected device");
             return false;
         }
     }

    void disconnectDevice() {
        if (this.tvDevice == null) {
            System.out.println(" There is no device to disconnect, try again");
        } else {
            System.out.println(this.tvDevice.getModelName() + " the device was disconnected.");
            this.tvDevice = null;
        }
        System.out.println();
    }

    @Override
    public void powerOn() {
        if (checkIfDeviceConnected()) {
            tvDevice.powerOn();
        }
        System.out.println();
    }

    @Override
    public void powerOff() {
        if (checkIfDeviceConnected()) {
            tvDevice.powerOff();
        }
        System.out.println();
    }

    @Override
    public void setChannel(int channel) {
        if (checkIfDeviceConnected()) {
            tvDevice.setChannel(channel);
        }
        System.out.println();
    }

    @Override
    public void currentChannel() {
        if (checkIfDeviceConnected()) {
            tvDevice.currentChannel();
        }
        System.out.println();
    }

    @Override
    public void upVolume() {
        if (checkIfDeviceConnected()) {
            tvDevice.upVolume();
        }
        System.out.println();
    }

    @Override
    public void downVolume() {
        if (checkIfDeviceConnected()) {
            tvDevice.downVolume();
        }
        System.out.println();
    }

    @Override
    public void mute() {
        if (checkIfDeviceConnected()) {
            tvDevice.mute();
        }
        System.out.println();
    }
}

