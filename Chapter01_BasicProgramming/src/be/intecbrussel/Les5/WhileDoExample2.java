package be.intecbrussel.Les5;

public class WhileDoExample2 {
    public static void main(String[] args) {

        int x = 1, sum = 0;

        while (x <= 10){
            sum = sum + x;
            x++;
        }
        System.out.println("Sum: " +sum);
    }
}
