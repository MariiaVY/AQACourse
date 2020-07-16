package RemoteDevice;

public interface Device {
    void powerOn();
    void powerOff();
    void setChannel(int channel);
    void currentChannel();
}
