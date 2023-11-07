package Les1.Package1;

public class Main2 {
    public static void main(String[] args) {
        Lambda2 result = (int x, int y) -> {return x+y;};
        System.out.println(result.sum(4,5));
    }
}
