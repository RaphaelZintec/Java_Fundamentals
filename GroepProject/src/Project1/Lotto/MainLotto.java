package Project1.Lotto;

import Project1.Casino;
import Project1.Roulette;

import java.util.Scanner;

public class MainLotto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int playerChoice = 0;
        int playerBalance = 500;
        Casino casino;

        System.out.println("Welcome to our casino!");


        System.out.println("Choose your game: 1.Claw Machine 2.Slot machine 3.Lotto 4.Roulette ");
        playerChoice = scanner.nextInt();

        switch (playerChoice){
            case 1 : casino = new Lotto(playerBalance);
        }

    }
}
