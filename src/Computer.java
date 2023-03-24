public class Computer extends Device {
    private Device[] connectedDevices;

    public Computer(double[] screenSize, String brand, int ports) {
        super(screenSize, brand);
        connectedDevices = new Device[ports];
    }

    public void connect(Device device, int port) {
        connectedDevices[port] = device;
    }
}
