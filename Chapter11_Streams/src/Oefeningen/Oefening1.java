package Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening1 {
    public static void main(String[] args) {

        //Te veel coden volgens mij, ik zou liever iets simplier te maken maar ik wet dat niet
        List<Integer> getallen = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenGetallen = getallen.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        int countEvenGetallen = (int)evenGetallen.stream().count();
        int sumEvenGetallen   = evenGetallen.stream().mapToInt(n->n).sum();
        double gemiddeldeVanEvenGetallen = sumEvenGetallen / countEvenGetallen;

        System.out.println("Mijn list: "+evenGetallen);
        System.out.println("Count even getallen: "+countEvenGetallen);
        System.out.println("Sum van even getallen: "+sumEvenGetallen);
        System.out.println("Gemiddelde van de sum: "+gemiddeldeVanEvenGetallen);
    }
}
