package Project1;

import java.util.Scanner;

public class ClawMachine extends Casino {

    private int numberOfTries = 0; // Tracker of tries(Счетчик попыток)

    private int currentPayout = 10000;

    public ClawMachine(int playerBalance){

        super(playerBalance, 1);

    }

    private boolean readyToWin(){

        return numberOfTries>=5&&(numberOfTries%5==0);

    }

//Checking if machine is ready to a big win

    private boolean readyToWinBigTime(){

        return numberOfTries>=10&&(numberOfTries%10==0);

    }


    public void playAGame(int moneyPaid) {

        if (moneyPaid >= 1) {

            for (int i = 0; i < moneyPaid; i++) {

                if (numberOfTries < 15) {

                    System.out.println("Game start...");

                    numberOfTries++;

// Логика игры - решение о выигрыше или проигрыше

//Logica of game - desicion of win or lose

/*if (Math.random() > 0.5) {

System.out.println("Congratulation you win a prise!");

playerBalance += 1; // Supposer what prise 1 €(Предположим, что приз - 1 €)

currentPayout -= 1;

} else {

System.out.println("Unfortunately you didn't win this time.");

playerBalance -= 1;

currentPayout += 1;

}*/

                    playerBalance -= 1;

                    currentPayout += 1;

                    if (readyToWin()) {

                        System.out.println("Ready to win (Level 1): true");

                    } else {

                        System.out.println("Ready to win (Level 1): false");

                    }

                    if (readyToWinBigTime()) {

                        System.out.println("Ready to big win (Level 2): true");

                    } else {

                        System.out.println("Ready to big win (Level 2): false");

                    }

                    System.out.println("Player balance: " + playerBalance + " €");

                    System.out.println("Current payout: " + currentPayout + " €");

                } else {

                    System.out.println("Maximum number of attempts reached (15).");//Достигнуто максимальное количество попыток

                    break;

                }

            }

        } else {

            System.out.println("Please insert at least 1 € to play the game or your balance is insufficient.");

        }

    }

    @Override
    public void launch(Scanner scanner) {

        playAGame(1);

    }

}