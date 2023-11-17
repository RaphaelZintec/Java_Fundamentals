package Les1;

public class NumberDuoApp {
    public static void main(String[] args) {
        NumberDuo<Integer> numberDuoInt    = new NumberDuo<>(44,33);
        NumberDuo<Long>    numberDuoLong   = new NumberDuo<>(444444444444444L,3333333333333L);
        NumberDuo<Double>  numberDuoDouble = new NumberDuo<>(44.55,33.77);
        System.out.println(numberDuoInt.sum());
        System.out.println(numberDuoLong.sum());
        System.out.println(numberDuoDouble.sum());

    }
}
