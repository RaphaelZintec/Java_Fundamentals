package Oefeningen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening2 {
    public static void main(String[] args) {

        //Hier begrijp ik dat list is een collection omdat collections herkent list
        List<String> strList = Arrays.asList("bonjour","hello","salam","nihao","goedemorgen");
        List<Integer> lengthList = strList.stream().map(l->l.length()).collect(Collectors.toList());
        int highestLength = Collections.max(lengthList);

        System.out.println("Mijn list: "+strList);
        System.out.println("Length van alle elementen: "+lengthList);
        System.out.println("Grootste length: "+highestLength);
    }
}
