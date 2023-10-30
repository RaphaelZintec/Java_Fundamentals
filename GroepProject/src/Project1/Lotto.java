package Project1;

import java.util.Random;

public class Lotto extends Casino{
    private int number1;
    private int number2;
    private int number3;
    private int currentPayout = 500;
    private boolean didYouWin;
    private Random random = new Random();

    private void rollRandomNumbers(){
        this.number1 = random.nextInt(11);
        this.number2 = random.nextInt(11);
        this.number3 = random.nextInt(11);
    }
    private void compareNumbers(int number1, int number2, int number3){
        if (this.number1 == number1 || this.number2 == number2 || this.number3 == number3){
            didYouWin = true;
        }
        else {
            didYouWin = false;
        }
    }
    public int getNumbers(int number1, int number2, int number3, int moneyPutIn){
        rollRandomNumbers();
        compareNumbers(number1, number2, number3);
        casinoBalance += moneyPutIn;
        if (didYouWin && currentPayout >= casinoBalance){
            playerBalance+=currentPayout;
            casinoBalance-=currentPayout;
            return currentPayout;
        }
        else {
            while (didYouWin != false){
                rollRandomNumbers();
                compareNumbers(number1, number2, number3);
            }
            casinoBalance+=currentPayout;
            playerBalance-=currentPayout;
            return 0;
        }
    }

    public void getNumbersCheat(){
        rollRandomNumbers();
        System.out.println(number1 +", "+ number2 +", "+ number3);
    }
}
