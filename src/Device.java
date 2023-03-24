public class Device {
    private double[] screenSize;
    private String brand;
    private boolean isOn;

    public Device(double[] screenSize, String brand) {
        this.screenSize = screenSize;
        this.brand = brand;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Your device is now on.");
    }

    public double[] getScreenSize() {
        return screenSize;
    }

    public String getBrand() {
        return brand;
    }
}
