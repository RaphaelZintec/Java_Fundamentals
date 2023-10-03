package be.intecbrussel.Les6.Opdracht2;

import java.util.Random;
import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {
        //HigherLowerApp

        //random var
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        //scanner var
        Scanner myScanner = new Scanner(System.in);
        int guessedNumber = 0;

        //attempts var
        boolean doesNotMatch = true;

        System.out.println("Welcome to Higher Lower App: Guess the random number between 0-99: "+randomNumber);

        while(doesNotMatch) {
            try {
                guessedNumber = myScanner.nextInt();
            } catch (Exception e) {
                myScanner.nextLine();
                System.out.println("Write only numbers without decimals: ");
                continue;
            }

            if (guessedNumber < 0 || guessedNumber > 99) {
                System.out.println("Enter only a number between 0-99");
            } else {
                if (guessedNumber < randomNumber) {
                    System.out.println("random number is higher");
                } else if (guessedNumber > randomNumber) {
                    System.out.println("random number is lower");
                } else if (guessedNumber == randomNumber) {
                    System.out.println("Congradulation: you found the correct number");
                    doesNotMatch = false;
                }
            }
        }
            System.out.println("Thank you for using our app and goodbye!");
    }
}
