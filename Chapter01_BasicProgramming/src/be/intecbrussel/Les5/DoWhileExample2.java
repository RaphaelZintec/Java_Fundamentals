package be.intecbrussel.Les5;

public class DoWhileExample2 {
    public static void main(String[] args) {
        /*
        int i = 10;
        do{
            System.out.println("hello world");
            i++;
        }while(i <6);
        */

        int i = 0;

        System.out.println("Utilisation de pré-incrémentation (++i) :");
        while (++i <= 5) {
            System.out.print(i + " ");
        }

        System.out.println("\nUtilisation de post-incrémentation (i++) :");
        i = 0; // Réinitialisation de i à 0
        while (i++ <= 5) {
            System.out.print(i + " ");
        }
    }
}
