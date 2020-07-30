package RemoteDevice;

public abstract class TVDevice implements Volume, Device {
    String modelName;
    boolean isOn;

    public TVDevice(String modelName, boolean isOn) {
        this.modelName = modelName;
        this.isOn = isOn;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public boolean isOn() {
        return isOn;
    }

}
