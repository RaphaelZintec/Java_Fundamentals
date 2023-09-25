package be.intecbrussel.Opdracht1;

public class WhileExample3 {
    public static void main(String[] args) {

        int num = 5;
        int result = 1;
        int i = 1, y = 1;


        while (true) {
            result = 1;
            while (y <= i) {
                result *= num;
                ++y;
            }
            if (result >= 10000) {
                break;
            }
            System.out.println(result);
            y = 1;
            ++i;
        }
    }
}
