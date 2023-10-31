package Project1;

public class ClawMachine{
    private int numbersOfTries;
    private int moneyInTheBank;

    public int getMoneyInTheBank() {
        return moneyInTheBank;
    }

    //Checking if machine is ready to win
    private boolean readyToWin(){
        return numbersOfTries>=5&&(numbersOfTries%5==0);
    }

    //Checking if machine is ready to a big win
    private boolean readyToWinBigTime(){
        return numbersOfTries>=10&&(numbersOfTries%10==0);
    }

    //Plaing
    public String playGame(int MoneyPaid){
        if (MoneyPaid>=1) {
            moneyInTheBank += MoneyPaid;
            numbersOfTries = numbersOfTries == 15 ? 0 : numbersOfTries+1;

            //Cheking wining condition
            if(readyToWin() && readyToWinBigTime()){
                return "Congratulations you won a small and a big prize";
            } else if (readyToWin()) {
                return "Congratulations you won a small prize";
            } else if (readyToWinBigTime()) {
                return "Congratulations you won a big prize";
            } else{
                return "Try again. Better luck next time";
            }
        }
        return "Please insert at least 1 euro to play the game";
    }

}
