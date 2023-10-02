package be.intecbrussel.Les6.Opdracht2;
import java.util.Scanner;
import java.util.ArrayList;
public class Opdracht3 {
    public static void main(String[] args) {
        //ElektriciteitApp

        //init vars
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> namenVanVerbruiker = new ArrayList<String>();
        char addNewHouse = 'y';
        int numberOfHouses = 1;
        int vermogenWattPerUur = 0;
        int aanatlUrenPerDag = 0;
        int aantalDagenPerMaand = 0;
        int eenheidsPrijsElektriciteit = 0;
        int step = 1;

        //welcome msg
        System.out.println("Welcome to calculate electrecity app!");

        //do while user keep adding houses
        do{
            //try catch if user enter letters for numbers
            try {
                System.out.println("Enter the following information about your house ->");
                //check the actual step
                switch (step){
                    case 1:{
                        System.out.println("1. Naam van de verbruiker: ");
                        namenVanVerbruiker.add(myScanner.nextLine());
                        ++step;
                    }
                    case 2:{
                        System.out.println("2. Vermogen in watt per uur (only numbers): ");
                        vermogenWattPerUur += Math.abs(myScanner.nextInt());
                        ++step;
                    }
                    case 3:{
                        System.out.println("3. Aantal uren per dag dat elektriciteit wordt gebruikt (only numbers): ");
                        aanatlUrenPerDag += Math.abs(myScanner.nextInt());
                        ++step;
                    }
                    case 4:{
                        System.out.println("4. Aantal dagen per maand waarop elektriciteit wordt gebruikt (only numbers): ");
                        aantalDagenPerMaand += Math.abs(myScanner.nextInt());
                        ++step;
                    }
                    case 5:{
                        System.out.println("5. Eenheidsprijs voor elektriciteit (only numbers): ");
                        eenheidsPrijsElektriciteit += Math.abs(myScanner.nextInt());
                        step = 1;
                    }

                }

                System.out.println("Do you want to add a new house? (y/n) : ");
                addNewHouse = (myScanner.next()).toCharArray()[0];

                if (addNewHouse == 'y'){
                    ++numberOfHouses;
                    myScanner.nextLine();
                }

            }catch(Exception e){
                System.out.println("Write only numbers when it's asked! Try again.");
                myScanner.nextLine();
                continue;
            }
        }while(addNewHouse == 'y');

        //Show resume
        System.out.println("We have calculated!\nDe namen van de verbruiker zijn: ");
        for(String name: namenVanVerbruiker){
            System.out.println("- "+name);
        }
        System.out.println("You have "+numberOfHouses+" houses");
        System.out.println("De totaal van jouw Vermogen in watt per uur is: "+vermogenWattPerUur);
        System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt is: "+aanatlUrenPerDag);
        System.out.println("Aantal dagen per maand waarop elektriciteit wordt gebruikt is: "+aantalDagenPerMaand);
        System.out.println("De totaal van jouw Eenheidsprijs voor elektriciteit is: "+eenheidsPrijsElektriciteit);

    }

}