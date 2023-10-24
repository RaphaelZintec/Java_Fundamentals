package Les1.Oefening5;

public class Varta implements Battery{
    private final String BRAND = "Varta";

    @Override
    public String getBrand() {
        return BRAND;
    }

    @Override
    public int deliverPower() {
        return 300;
    }
}
