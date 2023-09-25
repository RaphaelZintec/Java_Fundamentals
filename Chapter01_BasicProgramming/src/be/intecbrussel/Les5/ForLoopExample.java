package be.intecbrussel.Les5;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }
        for (int i = 1; i <= 5; ++i) {
            System.out.println(i+". Hello World");
        }
        for (int count = 10, count2 = 20; count >= 0 && count2>=12; count--, count2--) {
            System.out.println(count+" "+count2);
        }
    }
}
