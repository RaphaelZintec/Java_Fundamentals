package Oefeningen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening5 {
    public static void main(String[] args) {

        //hier heb ik distinct gevonden bij zoeken alle methoden in intellij en heb ik distinct herkend via mij eervaring met Data base
        List<String> list = Arrays.asList("hi","dag","salut","hi");
        List<String> listZonderDubbele = list.stream().distinct().collect(Collectors.toList());

        System.out.println("Mijn list: "+list);
        System.out.println("Mijn list zonder dubbele elementen: "+listZonderDubbele);
    }
}
