package Les1.Example2;

public class MainApp {
    public static void main(String[] args) {
        Multiplier m = new Multiplier();

        int a = m.multiplyNumers(2,5);
        int b = m.multiplyNumers(2,5,10);

        System.out.println(a);
        System.out.println(b);

    }
}
