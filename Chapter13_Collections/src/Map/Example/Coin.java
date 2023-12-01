package Map.Example;

public enum Coin {
    ONE_CENT(0.01),
    TWO_CENTS(0.02),
    FIVE_CENTS(0.05),
    TEN_CENTS(0.1),
    TWENTY_CENTS(0.2),
    FIFTY_CENTS(0.5),
    ONE_EURO(0.1),
    TWO_EUROS(0.2);

    private double value;

    Coin(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
