package Les1;

public class DuoApp {
    public static void main(String[] args) {
        Duo<String>  duo  = new Duo<>("tom","paul");
        Duo<Integer> duo2 = new Duo<>(4,5);

        System.out.println(duo.getS1());
        System.out.println(duo.getS2());
        System.out.println(duo2.getS1());
        System.out.println(duo2.getS2());

    }
}
