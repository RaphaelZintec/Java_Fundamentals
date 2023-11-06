package Project3;

public class SmartPhone implements ICamera, IGPS, IRadio, ISimCard, IWifi{
    private final double PRICE;
    private final String BRAND;
    private int numberOfPhotos;
    private boolean internetConnection;
    private String[] photos = {"All photo album", "Hollydays photo album", "WhatsApp photo album"};

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

    public int getNumberOfPhotos() {
        return numberOfPhotos;
    }

    @Override
    public void shootAPhoto(double amountOfPhotos) {
        numberOfPhotos+=amountOfPhotos;
        System.out.println("Phone took "+amountOfPhotos+" photos");
    }

    @Override
    public String[] viewPhotos() {
        return photos;
    }

    @Override
    public String locate(double latitude, double longitude) {
        return "Phone location is "+latitude+ " & "+ longitude;
    }

    @Override
    public void navigate() {
        if(internetConnection){
            System.out.println("Navigation on internet started");
        } else{
            System.out.println("You cannot navigate without internet connection");
        }
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
        this.internetConnection = true;
        System.out.println("Internet connected to "+internetConnection);
    }

    @Override
    public void disconnect(String internetConnection) {
        this.internetConnection = false;
        System.out.println("Internet disconnected from "+internetConnection);
    }

    @Override
    public void startCall(String number) {
        System.out.println("Calling "+number);
    }
}
