package be.intecbrussel.Les6.Opdracht2;
import java.util.Scanner;
import java.util.ArrayList;
public class ElektriciteitApp {
    public static void main(String[] args) {
        //ElektriciteitApp

        //init vars
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> namenVanVerbruiker = new ArrayList<String>();
        char addNewHouse = 'y';
        int numberOfHouses = 1;
        int vermogenWattPerUurTotal = 0;
        int aanatlUrenPerDagTotal = 0;
        int aantalDagenPerMaandTotal = 0;
        ArrayList<Integer> vermogenWattPerUurArray = new ArrayList<Integer>();
        ArrayList<Integer> aanatlUrenPerDagArray = new ArrayList<Integer>();
        ArrayList<Integer> aantalDagenPerMaandArray = new ArrayList<Integer>();
        int eenheidsPrijsElektriciteit = 0;
        int eenheidsPrijsElektriciteitTotal = 0;
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
                        vermogenWattPerUurArray.add(Math.abs(myScanner.nextInt()));
                        ++step;
                    }
                    case 3:{
                        System.out.println("3. Aantal uren per dag dat elektriciteit wordt gebruikt (only numbers): ");
                        aanatlUrenPerDagArray.add(Math.abs(myScanner.nextInt()));
                        ++step;
                    }
                    case 4:{
                        System.out.println("4. Aantal dagen per maand waarop elektriciteit wordt gebruikt (only numbers): ");
                        aantalDagenPerMaandArray.add(Math.abs(myScanner.nextInt()));
                        step = 1;
                    }
                }

                for(int i=numberOfHouses-1; i<numberOfHouses; ++i){
                    vermogenWattPerUurTotal += vermogenWattPerUurArray.get(i);
                    aanatlUrenPerDagTotal += aanatlUrenPerDagArray.get(i);
                    aantalDagenPerMaandTotal += aantalDagenPerMaandArray.get(i);
                    eenheidsPrijsElektriciteit = (vermogenWattPerUurArray.get(i)*aanatlUrenPerDagArray.get(i))*aantalDagenPerMaandArray.get(i);
                    eenheidsPrijsElektriciteitTotal += eenheidsPrijsElektriciteit;
                }

                System.out.println("Eenheidsprijs voor elektriciteit is: "+eenheidsPrijsElektriciteit);

                System.out.println("Do you want to add a new house? (y/n) : ");
                addNewHouse = (myScanner.next()).toCharArray()[0];

                if (Character.toLowerCase(addNewHouse) == 'y'){
                    ++numberOfHouses;
                    myScanner.nextLine();
                }

            }catch(Exception e){
                System.out.println("Write only numbers when it's asked! Try again.");
                myScanner.nextLine();
                continue;
                //System.out.println(e);
            }
        }while(Character.toLowerCase(addNewHouse) == 'y');

        //Show resume
        System.out.println("We have calculated!\nDe namen van de verbruiker zijn: ");
        for(String name: namenVanVerbruiker){
            System.out.println("- "+name);
        }
        System.out.println("You have "+numberOfHouses+" house(s)");
        System.out.println("De totaal van jouw Vermogen in watt per uur is: "+vermogenWattPerUurTotal);
        System.out.println("Aantal uren per dag dat elektriciteit wordt gebruikt is: "+aanatlUrenPerDagTotal);
        System.out.println("Aantal dagen per maand waarop elektriciteit wordt gebruikt is: "+aantalDagenPerMaandTotal);
        System.out.println("De totaal van jouw Eenheidsprijs voor elektriciteit is: "+eenheidsPrijsElektriciteitTotal);

    }

}