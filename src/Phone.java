public class Phone extends Device{
    private String phoneNumber;

    public Phone(double[] screenSize, String brand, String phoneNumber) {
        super(screenSize, brand);
        this.phoneNumber = phoneNumber;
    }

    public void call(String recipient) {
        System.out.println("Calling " + recipient);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
