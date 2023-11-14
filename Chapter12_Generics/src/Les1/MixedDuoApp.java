package Les1;

public class MixedDuoApp {
    public static void main(String[] args) {
        MixedDuo<String, Integer> mixedDuo  = new MixedDuo<>("paul",4);
        System.out.println(mixedDuo.getObj1());
        System.out.println(mixedDuo.getObj2());

    }
}
