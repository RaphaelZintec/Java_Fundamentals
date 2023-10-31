package Project1;

import java.util.Scanner;

public class MainRoulette {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        System.out.println("Welcome to roulette: guess a number between 0-20");
        number = scanner.nextInt();
        System.out.println("You won: "+roulette.rolleTheRoulette(200,number)+"€");
    }
}
