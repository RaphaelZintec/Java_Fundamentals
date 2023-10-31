package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Welcome to our casino!");
        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        int playerBalance = 500;
        Casino[] casino = {new ClawMachine(playerBalance), new SlotMachine(playerBalance), new Lotto(playerBalance), new Roulette(playerBalance)};
        do {
            System.out.println("\nChoose your game: 1.Claw Machine (1€) 2.Slot machine (50€) 3.Lotto (100€) 4.Roulette (200€) ");
            playerChoice = scanner.nextInt();
            if (Casino.playerBalance >= casino[playerChoice - 1].costPerTicket) {
                casino[playerChoice - 1].launch(scanner);
            } else {
                System.out.println("\nYour balance is too small for that game please choose another one");
            }
        } while (casino[playerChoice - 1].playerBalance >= 1);
        System.out.println("\nSorry your balance is too small to continue playing");
    }
}