package Oefening6;

import java.util.Scanner;

public class MainApp {

    public static void warningMessage(){
        System.out.println("Write only a number between 1-7: ");
    }
    public static void getDay(int dayInput, DagenVanDeWeek[] dagen){
        switch (dayInput){
            case 1:
                System.out.println(dagen[0]);
                break;
            case 2:
                System.out.println(dagen[1]);
                break;
            case 3:
                System.out.println(dagen[2]);
                break;
            case 4:
                System.out.println(dagen[3]);
                break;
            case 5:
                System.out.println(dagen[4]);
                break;
            case 6:
                System.out.println(dagen[5]);
                break;
            case 7:
                System.out.println(dagen[6]);
                break;
            default:
                System.out.println("Your day doesn't exist");
        }
    }

    public static void main(String[] args) {

        //OEFENING 1 : ENUM - FOR() LOOP
            DagenVanDeWeek[] dagen = DagenVanDeWeek.values();
            for(int i = 0; i < dagen.length; ++i){
                System.out.println(dagen[i]);
            }

        //OEFENING 2 : ENUM - SCANNER - SWITCH()
        Scanner myScanner = new Scanner(System.in);
        int dayInput = 0;

        while (true){
            try{
                warningMessage();
                dayInput = myScanner.nextInt();
                if (dayInput > 0){
                    getDay(dayInput, dagen);
                }
            }catch (Exception e){
                myScanner.nextLine();
            }
        }

    }
}
