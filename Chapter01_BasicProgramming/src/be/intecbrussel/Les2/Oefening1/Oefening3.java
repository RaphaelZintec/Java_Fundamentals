package be.intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner mySimpleCalculator = new Scanner(System.in);

        System.out.println("Welkom bij de eenvoudige rekenmachine!");

        System.out.println("Voer uw eerste waarde in: ");
        int firstValue = mySimpleCalculator.nextInt();

        System.out.println("Voer uw tweede waarde in: ");
        int secondValue = mySimpleCalculator.nextInt();

        System.out.println("Optellen: "+ firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
        System.out.println("Aftrekken: "+ firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
        System.out.println("Vermenigvuldigen: "+ firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
        System.out.println("Delen: "+ firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
        System.out.println("Modulo: "+ firstValue + " % " + secondValue + " = " + (firstValue % secondValue));
    }
}
