package be.intecbrussel.Les2.Oefening2;

import java.util.Scanner;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //1
        StringBuilder strBuild = new StringBuilder("The Quick BroWn FoX!");
        String str = strBuild.toString();
        System.out.println(strBuild +" -> "+ str.toLowerCase());

        //2
        do{
            System.out.println("Type any text and i will convert it in lowercases");
            strBuild.setLength(0);
            strBuild.append(myScanner.nextLine());
            str = strBuild.toString();
            System.out.println(str.toLowerCase());
        }while(true);
    }
}