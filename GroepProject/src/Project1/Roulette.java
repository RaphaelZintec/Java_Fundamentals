package Project1;

import java.util.Random;

public class Roulette {
    //Attributes
    private int amountsOfTimesHouseLost = 1;
    private int winningNumber;
    private int payout = 500;
    private Random random = new Random();

    //methode : hier ga je kijken of dat het huis al meer dan 3 keer heeft verlonen Of dat de payout kleiner is dan 500
    private void shouldFailSafeBeUsed(int numberChosen) {
        if (amountsOfTimesHouseLost > 3 || payout < 500) {
            //als 1 van de twee conditie waar zijn , dan nieuw random treken tussen 0 en 20
            do {
                winningNumber = random.nextInt(21);//genereren een willekeurige nummber tussen 0 en 20
            } while (winningNumber == numberChosen);//totdat de winningsNumber niet hetzelfde is als de numberChosen
        }else {
            winningNumber = random.nextInt(21);//zoniet moet je maar 1 keer die random
        }
    }

    //in deze methode moet nakijken of de winningsNumber overeenkomst met de numberChosen, Als dit het geval is, krijg 500 Euro
    public int rolleTheRoulette(int moneyPutIn, int numberChosen) {
        payout+=moneyPutIn;
        shouldFailSafeBeUsed(numberChosen);
        System.out.println("Winning numer is: "+winningNumber);
        if (winningNumber == numberChosen) {
            payout -= 500; //als in dit geval casinoBalance minder dan payout
            return 500;  //dan krijgt de player 500 Euro
        } else {
            return 0;//dan geen geld nodig
        }
    }
}



