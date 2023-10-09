package Oefening1;

import static Oefening1.Calculator.getModulo;

public class MainCalc {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        //Oefening 1
        System.out.println("Oefening 1");
        System.out.println("De kleinste nummer is: "+myCalculator.getSmallestNumber(10,24,18));
        System.out.println("De kleinste nummer is: "+myCalculator.smallestNumber);

        //Oefening 2
        System.out.println("\nOefening 2");
        System.out.println("Your number is: "+(myCalculator.checkEvenOnevenNumber(2480) ? "Even" : "Oneven"));

        //Oefening 3: int
        System.out.println("\nOefening 3 (int)");
        System.out.println("Addition: "      +myCalculator.getAddition(10,5) );
        System.out.println("Substraction: "  +myCalculator.getSubtraction(10,5) );
        System.out.println("Multiplication: "+myCalculator.getMultiplication(10,5) );
        System.out.println("Division: "      +myCalculator.getDivision(10,5) );

        //Oefening 3: modulo static
        System.out.println("Modulo: "        +getModulo(10,5) );

        //Oefening 3: double
        System.out.println("\nOefening 3 (double)");
        System.out.println("Addition: "      +myCalculator.getAddition(10,5.5) );
        System.out.println("Substraction: "  +myCalculator.getSubtraction(10.5,5) );
        System.out.println("Multiplication: "+myCalculator.getMultiplication(10.8,5.14) );
        System.out.println("Division: "      +myCalculator.getDivision(349,5) );
    }
}
