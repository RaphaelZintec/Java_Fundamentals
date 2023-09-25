package be.intecbrussel.Les4.Oefening3;

public class Oefening2 {
    public static void main(String[] args) {

        //var initialisation
        int input = 10;

        //check if var negatif
        if(input < 0){
            System.out.println("input is negatief");
        }
        //check if var positif
        else if(input > 0){
            System.out.println("input is positief");
        }
        //if nor negatif nor positif than var is equal 0
        else{
            System.out.println("input is gelijk aan 0");
        }
    }
}
