package be.intecbrussel.Opdracht1;

import java.util.Scanner;

import java.util.Scanner;

public class WhileExample5 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Please enter a non decimal number between 0-10: ");

            if (myScanner.hasNextInt()) {
                i = myScanner.nextInt();
            } else {
                break;
            }
        }
        while (i >= 0 && i <= 10);
    }
}
