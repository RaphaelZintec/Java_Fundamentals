package be.intecbrussel.Les7.Opdracht3;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Oefening4 {
    /* 1. VARIABLES INIT
    * userCredits = credits in game
    * userSold = user real money in game
    * one ticket cost 3 credits
    * the game sell min 20 credits for 5 real money
    * dies have 2 faces
    * winning number is 13
    * */
        public static int userCredits = 17;
        public static int userSold = 22;
        public static int numberOfPlayedTickets = 0;
        public static boolean winnerOfFriendshipCrown = false;
        public static boolean notEnoughSold = false;
        public static boolean userWantToBuyCredits = true;
        public static String enteredText = "";
        public static Random dobbelsteenNumber = new Random();
        public static Scanner myScanner = new Scanner(System.in);
        final public static int NUMBER_OF_DIES_FACES = 21;
        final public static int NUMBER_OF_THE_WINNING_FRIENDSHIP_CROWN = 13;
        final public static int NUMBER_OF_TICKETS_USER_CAN_BUY = 20;
        final public static int PRICE_FOR_20_CREDITS = 5;
        final public static int COST_PER_TICKET = 3;

    /* 2. METHODS INIT*/
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
        public static void checkUserCredits(){
            if(userCredits < COST_PER_TICKET){
                System.out.println("You can't buy more tickets because you have "+userCredits+" credit(s)");
                System.out.println("The cost per ticket is : "+COST_PER_TICKET+" credits");
                buyCredits();
            }
            else{
                buyTickets();
            }
        }
        public static void buyCredits(){

            if(userSold >= PRICE_FOR_20_CREDITS){
                System.out.println("Your sold is : "+userSold+"$");
                System.out.println("The price for "+NUMBER_OF_TICKETS_USER_CAN_BUY+" credits is "+ PRICE_FOR_20_CREDITS+"$");
                System.out.println("Do you wanna buy more credits? (y/n): ");

                if(checkUserEntry()){
                    userSold -= PRICE_FOR_20_CREDITS;
                    userCredits += NUMBER_OF_TICKETS_USER_CAN_BUY;
                }
                else{
                    System.out.println("Ok, Goodbye!");
                    userWantToBuyCredits = false;
                }
            }
            else{
                System.out.println("Sorry your sold: "+userSold+"$ is too low to buy credits. Good bye!");
                notEnoughSold = true;
            }
        }
        public static void buyTickets(){
            do{
                ++numberOfPlayedTickets;
                userCredits-=COST_PER_TICKET;
                if(dobbelsteenNumber.nextInt(NUMBER_OF_DIES_FACES) == NUMBER_OF_THE_WINNING_FRIENDSHIP_CROWN){
                    winnerOfFriendshipCrown = true;
                    break;
                }

            }while(userCredits>=COST_PER_TICKET);
        }
        public static boolean haveUserWon(){
            if(winnerOfFriendshipCrown){
                System.out.println("Congradulation you won the FriendShip Crown!");
                showUserProfile();
                return true;
            }
            else if(notEnoughSold || !userWantToBuyCredits){
                return false;
            }
            else{
                showUserProfile();
                System.out.println("Do you wanna buy tickets? 1 ticket cost "+COST_PER_TICKET+" credits (y/n): ");
                return false;
            }
        }
        public static void showUserProfile(){
            System.out.println(winnerOfFriendshipCrown ? "You are the winner of Friendship Crown" : "Do you wanna win the Friendship Crown?");
            System.out.println("Your credits in game: "+userCredits);
            System.out.println("Your sold : "+userSold+"$");
            System.out.println("You played "+numberOfPlayedTickets+" tickets");
        }

    /* 3. LAUNCH WITH MAIN*/
        public static void main(String[] args) {
            System.out.println("Welcome to LootBoxes!");
            System.out.println("Do you wanna play? (y/n)");

            if (checkUserEntry()) {
                while(!haveUserWon() && !notEnoughSold && userWantToBuyCredits){
                    if(checkUserEntry()){
                        checkUserCredits();
                    }
                    else{
                        System.out.println("Ok, Goodbye!");
                        break;
                    }
                }
            }
            else{
                System.out.println("Ok, Goodbye!");
            }
        }
}



