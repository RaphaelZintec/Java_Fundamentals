package Project2;

import java.util.Random;
import java.util.Scanner;
public class Roulette extends Casino {
    private int amountsOfTimesHouseLost = 1;
    private int winningNumber;
    private int payout = 10000;
    private Random random = new Random();

    public Roulette(int playerBalance) {
        super(playerBalance, 200);
    }

    private void shouldFailSafeBeUsed(int numberChosen) {
        if (amountsOfTimesHouseLost > 3 || payout < 500) {
            do {
                winningNumber = random.nextInt(21);
            } while (winningNumber == numberChosen);
        } else {
            winningNumber = random.nextInt(21);
        }
        if(numberChosen == 5 && payout >= 500){
            winningNumber = numberChosen;
        }
    }

    public int rolleTheRoulette(int moneyPutIn, int numberChosen) {
        payout += moneyPutIn;
        playerBalance -= moneyPutIn;
        shouldFailSafeBeUsed(numberChosen);
        System.out.println("Winning number is: " + winningNumber);
        if (winningNumber == numberChosen) {
            payout -= 500;
            playerBalance += 500;
            return 500;
        } else {
            return 0;
        }
    }

    @Override
    public void launch(Scanner scanner) {
        int number = -1;
        System.out.println("Welcome to Roulette: guess 1 number 0-20: ");
        number = scanner.nextInt();
        System.out.println("You won: " + rolleTheRoulette(200, number) + "€ current payout is: " + payout + " and player balance is: " + playerBalance);
    }
}
