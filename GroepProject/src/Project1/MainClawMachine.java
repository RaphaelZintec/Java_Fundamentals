package Project1;

public class MainClawMachine {
    public static void main(String[] args) {
        ClawMachine clawMachine = new ClawMachine();
        System.out.println("Welcome to ClawMachine");

        for (int i = 0; i<16; ++i){
            System.out.println(clawMachine.playGame(1));
        }
    }
}
