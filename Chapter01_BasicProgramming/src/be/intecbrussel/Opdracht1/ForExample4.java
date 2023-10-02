package be.intecbrussel.Opdracht1;

public class ForExample4 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 25; i >= 0; --i) {
            System.out.println(alphabet.toLowerCase().charAt(i));
        }
    }
}
