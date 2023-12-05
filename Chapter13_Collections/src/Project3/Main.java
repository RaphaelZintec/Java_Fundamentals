package Project3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\uD83D\uDFE1Opdracht 1: LinkedHashSet (UNIQUE->Set + MAINTAIN ORDER->Linked)\uD83D\uDFE1");
        Set<Patient> uniqueList = new LinkedHashSet<>(Patient.getAllPatients());
        uniqueList.forEach(System.out::println);

        System.out.println("\n\uD83D\uDFE1Opdracht 2: PriorityQueue (PRIORITY= high temperature +37° then age descening)\uD83D\uDFE1");
        List<Patient> list = new ArrayList<>(uniqueList);


    }
}
