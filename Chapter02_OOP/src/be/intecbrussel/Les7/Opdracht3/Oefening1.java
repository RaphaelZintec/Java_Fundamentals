package be.intecbrussel.Les7.Opdracht3;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
public class Oefening1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String username = "";

        System.out.println("Welcome to World Of PeaceCraft! Enter your username: ");

        username = myScanner.nextLine();

        //IF ELSE
        if(!username.toLowerCase().contains("gori") && !username.toLowerCase().contains("harambe")){
            System.out.println("Good job, your successfully subscribed!");
        }
        else{
            System.out.println("First warning. We don't accept your username. Try again with another username.");
            username = myScanner.nextLine();

            if(!username.toLowerCase().contains("gori") && !username.toLowerCase().contains("harambe")){
                System.out.println("Good job, your successfully subscribed!");
            }
            else{
                System.out.println("Last warning. We don't accept your username. Try again with another username.");
                username = myScanner.nextLine();

                if(!username.toLowerCase().contains("gori") && !username.toLowerCase().contains("harambe")){
                    System.out.println("Good job, your successfully subscribed!");
                }
                else{
                    System.out.println("Sorry you are banned!");
                }
            }
        }
    }
}
