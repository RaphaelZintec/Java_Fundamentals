package ArraylistOefeningen;

import java.util.*;

public class Oefening3 {
    public static void main(String[] args) {
        ArrayList<String> words  = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String word = "";

        System.out.println("Enter words :");

        do{
            word = sc.nextLine();
            words.add(word);
        }while(!word.equals("end"));
        words.removeIf(n->n.equals("end"));

        words.forEach(System.out::println);
    }
}
