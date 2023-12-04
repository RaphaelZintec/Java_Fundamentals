package Les1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try{
            c=a/b;
            System.out.println(c);
        } catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        } catch (Exception e){
            System.out.println("unkown exception");
        } finally {
            System.out.println("final code to close");
        }
        System.out.println("code work");

    }
}
