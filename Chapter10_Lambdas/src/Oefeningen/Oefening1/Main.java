package Oefeningen.Oefening1;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = (int a, int b, int c) -> {
            if (a % 2 == 0)
                System.out.println(a);
            if (b % 2 == 0)
                System.out.println(b);
            if (c % 2 == 0)
                System.out.println(c);
        };
        myMath.myFunction(33,44,57);
        myMath.myFunction(28,41,63);
    }
}
