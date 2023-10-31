package Project1;

import java.util.Scanner;

public abstract class Casino {
    public int playerBalance;
    public int costPerTicket;

    public Casino(int playerBalance, int costPerTicket){
        this.playerBalance = playerBalance;
        this.costPerTicket = costPerTicket;
    }

    public abstract void launch(Scanner scanner);
}

