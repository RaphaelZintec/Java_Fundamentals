package Les2;

import java.util.Scanner;

public class ExceptionExample6 {
    public static void main(String[] args) {

        String sAge;
        int iAge;

        Scanner mySc = new Scanner(System.in);
        System.out.println("Geef je leeftijd in");
        sAge = mySc.nextLine();

        try {
            iAge = Integer.parseInt(sAge);
            System.out.println(iAge);
        } catch (NumberFormatException e){
            System.out.println("alleen nummers pas op");
        }

    }
}
