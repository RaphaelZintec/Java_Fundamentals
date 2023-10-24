package Les1.Oefening5;

public class Duracel implements Battery{
    private final String BRAND = "Duracel";

    @Override
    public String getBrand() {
        return BRAND;
    }

    @Override
    public int deliverPower() {
        return 100;
    }

}
