package be.intecbrussel.Les2;

public class BooleanExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean equal = (a == b);
        boolean notequeal = (a != b);
        boolean biggerThan = (a > b);
        boolean smallerThan = (a < b);
        boolean biggerEqual = (a >= b);
        boolean smallerEqual = (a <= b);

        System.out.println("A =  "+a+" & B = "+b);
        System.out.println("equal : "+equal);
        System.out.println("notequeal : "+notequeal);
        System.out.println("biggerThan : "+biggerThan);
        System.out.println("smallerThan : "+smallerThan);
        System.out.println("biggerEqual : "+biggerEqual);
        System.out.println("smallerEqual : "+smallerEqual);

        boolean c = true;
        boolean d = false;

        boolean result01 = (c && d);
        boolean result02 = (c || d);
        boolean result03 = (!(c && d));

        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);




    }
}
