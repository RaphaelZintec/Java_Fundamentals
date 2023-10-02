package be.intecbrussel.Les1.Oefening1;

public class Oefening3 {
    public static void main(String[] args) {
        String str = "hello world";

        //1. Easy
        //System.out.println(str.replaceAll("hello world","HeLlO WoRlD"));

        //2. Hard
        for (int i = 0; i < str.length(); ++i) {
            if (i % 2 == 0) {
                System.out.print(str.toUpperCase().charAt(i));
            } else {
                System.out.print(str.toLowerCase().charAt(i));
            }
        }
    }
}
