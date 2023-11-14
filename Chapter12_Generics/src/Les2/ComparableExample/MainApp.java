package Les2.ComparableExample;

public class MainApp {
    public static void main(String[] args) {
        ComparableDuo<Integer> comparableDuo = new ComparableDuo<>(44,55);
        System.out.println(comparableDuo.getHighest());
        System.out.println(comparableDuo.getLowest());

        ComparableDuo<String> comparableDuoString = new ComparableDuo<>("hello","bob");
        System.out.println(comparableDuoString.getHighest());
        System.out.println(comparableDuoString.getLowest());


    }
}
