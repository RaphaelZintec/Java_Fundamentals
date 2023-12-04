package Les1;

import java.io.FileInputStream;

public class ExceptionExample5 {
    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("55");
            System.out.println(num);
            int result = 5 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
