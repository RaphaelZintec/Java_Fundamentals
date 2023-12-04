package Les1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExceptionExample2 {
    public static void main(String[] args) {

        int a;

        try{
            a=Integer.parseInt("hello");
            System.out.println(a);
        } catch(Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("final code to close");
        }
        System.out.println("Code werkt");

    }
}
