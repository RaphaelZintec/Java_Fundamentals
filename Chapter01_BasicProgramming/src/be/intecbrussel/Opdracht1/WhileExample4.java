package be.intecbrussel.Opdracht1;

public class WhileExample4 {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int i = 0;
        while (i < 26) {
            System.out.println(alphabet.charAt(i));
            ++i;
        }
    }
}
