package be.intecbrussel.Les7.Opdracht3;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Oefening4 {
    //user profil
    public static int userCredits = 17;
    public static int userSold = 22;
    public static int costPerTicket = 3;
    public static int numberOfPlayedTickets = 0;
    public static boolean winnerOfFriendshipCrown = false;
    public static boolean buyMoreCredits = false;
    public static boolean buyMoreTickets = false;
    public static boolean userChoice = false;

    //game initialisation variables
    public static String enteredText = "";
    public static Random dobbelsteenNumber = new Random();
    public static Scanner myScanner = new Scanner(System.in);

    public static boolean checkUserEntry(){
        enteredText = myScanner.nextLine().toLowerCase();
        while(enteredText.charAt(0) != 'y' && enteredText.charAt(0) != 'n'){
            System.out.println("Type only 'y' to continue and 'n' to stop: ");
            enteredText = myScanner.nextLine().toLowerCase();
        }
        if(enteredText.charAt(0) == 'y'){
            return true;
        }else{
            return false;
        }
    }
    public static void buyTickets(){
        do{
            ++numberOfPlayedTickets;
            userCredits-=costPerTicket;
            if(dobbelsteenNumber.nextInt(21) == 13){
                winnerOfFriendshipCrown = true;
                break;
            }

        }while(userCredits>=3);
    }
    public static boolean haveUserWon(){
        if(winnerOfFriendshipCrown){
            System.out.println("Congradulation you won the FriendShip Crown!");
            showUserProfile();
            return true;
        }
        else{
            System.out.println("Sorry you lost!");
            showUserProfile();
            System.out.println("Do you wanna buy 20 more tickets for 5€? (y/n) ");
            return false;
        }
    }
    public static void showUserProfile(){
        System.out.println("Your credits: "+userCredits);
        System.out.println("Your sold: "+userSold);
        System.out.println("You played "+numberOfPlayedTickets+" tickets");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LootBoxes!");
        System.out.println("Do you wanna buy tickets? (y/n)");

        userChoice = checkUserEntry();

        if (userChoice){
            buyTickets();
            if(!haveUserWon()){
                if(checkUserEntry()){
                    System.out.println("Do you wanna buy 20 more tickets for 5€?");
                } else{
                    System.out.println("Ok goodbye!");
                }
            }
        }
        else {
            System.out.println("Ok goodbye!");
        }
    }
}



