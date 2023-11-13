package Oefeningen.Oefening2;

public class Main {
    public static void main(String[] args) {
        MyMath myMath = (int number) -> {
            if(number == 0)
                return 1;
            for (int i = number-1; i>=1; --i)
                number*=i;
            return number;
        };
        System.out.println(myMath.findFactorial(7));
    }
}
