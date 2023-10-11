package Test;


import java.util.Random;

public class TestApp {
    public static void main(String[] args) {

        Random random = new Random();
        int a = Math.abs(random.nextInt()); //0 2147483647
        int b = random.nextInt(50); //van 0 tot 49

        // Generate a random number between 50 and 100 (inclusive)
        int randomNumber = random.nextInt(51) + 50; // Generates a number between 0 and 10 and then adds 10
        //random.nextInt(11) => 0-50 (51 is not included)
        // + 50 => go to 100

        System.out.println(randomNumber);
    }
}
