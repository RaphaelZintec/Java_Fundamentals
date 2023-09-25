package be.intecbrussel.Les2.Oefening1;

public class Oefening7 {
    public static void main(String[] args) {
        boolean bool01 = true;
        boolean bool02 = false;

        System.out.println("bool01 == "+bool01+" && bool02 == "+bool02);
        System.out.println("Allebei == true: "+ (bool01 && bool02) );
        System.out.println("Een van de twee == true: "+ (bool01 || bool02) );
        System.out.println("Tegenovergestelde van allebei == true: "+ (!(bool01 && bool02)) );
    }
}
