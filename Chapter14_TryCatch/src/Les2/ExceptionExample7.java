package Les2;

import java.util.Scanner;

public class ExceptionExample7 {
    public static void main(String[] args) {
        ageCheck(19);

    }

    public static void ageCheck(Integer num) throws ArithmeticException, NumberFormatException{
        if(num<100){
            throw new ArithmeticException("u mag niet stemmen");
        }
        else{
            System.out.println("U kent stemmen");
        }


    }


}
