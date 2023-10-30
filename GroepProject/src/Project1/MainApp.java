package Project1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lotto lotto = new Lotto();
        int number1 = -1;
        int number2 = -1;
        int number3 = -1;

        System.out.println("Welcome to Lotto game: 3 lucks to guess one correct number");
        System.out.println("Enter a first number between 0-10 : ");
        number1 = scanner.nextInt();
        System.out.println("Enter a second number between 0-10 : ");
        number2 = scanner.nextInt();
        System.out.println("Enter a third number between 0-10 : ");
        number3 = scanner.nextInt();


        System.out.println("You have won: "+lotto.getNumbers(number1, number2, number3, 100) + "€");
    }
}
