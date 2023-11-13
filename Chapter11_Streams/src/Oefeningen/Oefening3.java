package Oefeningen;

import java.util.Arrays;
import java.util.List;

public class Oefening3 {
    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        boolean containsOnlyEven = listOfNumbers.stream().allMatch(n->n%2==0);

        System.out.println("Mijn list: "+listOfNumbers);
        System.out.println("Bevat mijn list alleen even getallen: "+containsOnlyEven);
    }
}
