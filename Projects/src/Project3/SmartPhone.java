package Project3;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi{
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;

    public SmartPhone(double PRICE, String BRAND){
        this.PRICE = PRICE;
        this.BRAND = BRAND;
    }

    public double getPRICE() {
        return PRICE;
    }

    public String getBRAND() {
        return BRAND;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        System.out.println("Phone took "+amountOfPhotos+" photos");
    }

    @Override
    public String[] viewPhotos() {
        return new String[0];
    }

    @Override
    public String locate(double latitude, double longitude) {
        return "Phone location is "+latitude+ " & "+ longitude;
    }

    @Override
    public void navigate() {
        System.out.println("GPS working");
    }

    @Override
    public void playChannel(double fm) {
        System.out.println("Radio playing channel "+fm);
    }

    @Override
    public void changeChannel(double fm) {
        System.out.println("Radio channel changed to "+fm);
    }

    @Override
    public void connect(String internetConnection) {
        System.out.println("Internet connected to "+internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        System.out.println("Internet disconnected from "+internetConnection);
    }

    @Override
    public void startCall(String number) {
        System.out.println("Calling "+number);
    }
}
