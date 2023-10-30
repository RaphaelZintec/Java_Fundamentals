package Project1;

public class ClawMachine extends Casino{
    private int numbersOfTries;
    private int moneyInTheBank;

    public int getMoneyInTheBank() {
        return moneyInTheBank;
    }

    //Checking if machine is ready to win
    public boolean readyToWin(){
        return numbersOfTries>5&&(numbersOfTries%5==0);
    }

    //Checking if machine is ready to a big win
    public boolean readyToWinBigTime(){
        return numbersOfTries>10;
    }

    //Plaing
    public String playGame(int MoneyPaid){
        if (MoneyPaid>=1) {
            moneyInTheBank += MoneyPaid;
            numbersOfTries++;

            //Cheking wining condition
            if (readyToWin()){
                return "Congratulations you win a small prize";
            }else if (readyToWinBigTime()){
                return "Wow you win a big prize";
            }else {
                return "Try again. Better luck next time";
            }
        }else {
            return "Please insert at least 1 euro to play the game";
        }
    }
}
