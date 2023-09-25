package be.intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner countAverageNumber = new Scanner(System.in);

        System.out.println("Schrijf jouw eerste nummer: ");
        int firstNumber = countAverageNumber.nextInt();

        System.out.println("Schrijf jouw tweede nummer: ");
        int secondNumber = countAverageNumber.nextInt();

        System.out.println("Schrijf jouw derde nummer: ");
        int thirdNumber = countAverageNumber.nextInt();

        System.out.println("Schrijf jouw vierde nummer: ");
        int fourthNumber = countAverageNumber.nextInt();

        System.out.println("Schrijf jouw vijfde nummer: ");
        int fifthNumber = countAverageNumber.nextInt();

        int averageNumber = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

        System.out.println("Het gemiddelde aantal van vijf cijfers is: " +(averageNumber/5));

    }
}
