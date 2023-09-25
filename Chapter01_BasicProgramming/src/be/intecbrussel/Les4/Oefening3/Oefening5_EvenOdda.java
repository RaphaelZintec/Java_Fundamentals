package be.intecbrussel.Les4.Oefening3;

import java.util.Scanner;

public class Oefening5_EvenOdda {
    public static void main(String[] args) {

        //initialize scanner + variables (int number + boolean isNumberInt)
        Scanner myScanner = new Scanner(System.in);
        int number = 0;
        boolean isNumberInt = false;

        //welcome message
        System.out.println("Welcome to EvenOdda!");

        //Enter a number
        System.out.println("Enter your number without decimals and spaces to see if it's an even or a odd number (! Maximal number is 2147483647, minimal number is 1 !): ");

        //check if the number has only the type INT: no characters, no string, no float
        try {
            number = myScanner.nextInt();
            isNumberInt = true;
        } catch (Exception e) {
            System.out.println("Please enter only a number without decimals.");
        }

        //check if number is int and bigger than 0
        if(isNumberInt && number > 0){
            //check if the entered number is Even of Odd
            if ((number % 2) == 0) {
                System.out.println("The entered number is Even.");
            } else {
                System.out.println("The entered number is Odd.");
            }
        }
        //not a decimal number or 0 or negatif number
        else{
            System.out.println("Nor even, nor odd number because you haven't entered a number or your number was smaller or equal to zero. Please try again.");
        }

        System.out.println("Thank you and goodbye!");
    }
}
