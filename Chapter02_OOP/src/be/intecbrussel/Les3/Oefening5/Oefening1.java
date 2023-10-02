package be.intecbrussel.Les3.Oefening5;
import java.util.Random;
public class Oefening1 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 1; i<=5; ++i){
            System.out.println(i+". "+random.nextInt());
        }
    }
}
