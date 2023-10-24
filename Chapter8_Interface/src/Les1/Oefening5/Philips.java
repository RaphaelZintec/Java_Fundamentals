package Les1.Oefening5;

public class Philips implements Battery{
    private final String BRAND = "Philips";

    @Override
    public String getBrand() {
        return BRAND;
    }

    @Override
    public int deliverPower() {
        return 200;
    }
}
