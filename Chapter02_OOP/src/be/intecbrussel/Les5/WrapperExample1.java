package be.intecbrussel.Les5;

public class WrapperExample1 {
    public static void main(String[] args) {
        Integer myInt = 2500;
        Double myDouble = 20.99;
        Character myChar = 'Z';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        String myString = myInt.toString();
        System.out.println(myString);
        System.out.println("This is a string with a lengt of: " + myString.length());
    }
}
