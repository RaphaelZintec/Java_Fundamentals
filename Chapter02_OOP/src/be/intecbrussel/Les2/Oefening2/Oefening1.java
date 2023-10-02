package be.intecbrussel.Les2.Oefening2;

import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String strNormal = "";
        String strReverse = "";
        System.out.println("Type a word and let's check if it's a PALINDROM");

        do{
            str.setLength(0);
            str.append(myScanner.nextLine());
            strNormal = str.toString();

            str.reverse();
            strReverse = str.toString();

            if( strNormal.contains(strReverse) ){
                System.out.println("You entered a palindrome: "+strNormal+" & "+strReverse);
            }
            else{
                System.out.println("Your word is not a palindrome: "+strNormal+" & "+strReverse);
            }

        }while(true);
    }
}
