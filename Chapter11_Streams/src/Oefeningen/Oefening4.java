package Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening4 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum = listOfNumbers.stream().mapToInt(n->n).sum();

        System.out.println("Mijn list: "+listOfNumbers);
        System.out.println("Product van alle getallen van mijn list: "+sum);
    }
}
