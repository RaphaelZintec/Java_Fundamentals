package be.intecbrussel.Les3;
import java.util.Random;
public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50)+10;
        System.out.println(a);
    }
}
