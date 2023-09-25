package be.intecbrussel.Les2.Oefening1;

import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner myProfil = new Scanner(System.in);

        System.out.println("Schrijf jouw naam:");
        String name = myProfil.nextLine();
        System.out.println("Jouw naam is: " + name);

        System.out.println("Schrijf jouw adres:");
        String adress = myProfil.nextLine();
        System.out.println("Jouw adress is: " + adress);

        System.out.println("Schrijf jouw telefoonnummer:");
        int phone = myProfil.nextInt();
        System.out.println("Jouw telefoonnummer is: " + phone);

    }
}
