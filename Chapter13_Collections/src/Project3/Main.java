package Project3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\uD83D\uDFE1Opdracht 1: LinkedHashSet (UNIQUE->Set + MAINTAIN ORDER->Linked)\uD83D\uDFE1");
        Set<Patient> uniqueList = new LinkedHashSet<>(Patient.getAllPatients());
        uniqueList.forEach(System.out::println);

        System.out.println("\n\uD83D\uDFE1Opdracht 2: PriorityQueue (PRIORITY= high temperature +37° then age descening)\uD83D\uDFE1");
        Queue<Patient> listTemperatureAge = new PriorityQueue<>(uniqueList);
        uniqueList.stream().filter(p->p.getTemperature()>=38).sorted(Comparator.comparing(Patient::getTemperature).reversed()).forEach(p->listTemperatureAge.offer(p));
        uniqueList.stream().filter(p->p.getTemperature()<38).sorted(Comparator.comparing(Patient::getAge).reversed()).forEach(p->listTemperatureAge.offer(p));
        listTemperatureAge.forEach(System.out::println);
/*
        System.out.println("\n\uD83D\uDFE1BONUS\uD83D\uDFE1");
        List<Patient> listOfPatientsBonus = new ArrayList<>(uniqueList);
        listOfPatientsBonus.sort(new AgeSorter().reversed());
        listOfPatientsBonus.forEach(System.out::println);
        System.out.println("\n\uD83D\uDFE1BONUS2\uD83D\uDFE1");
        listOfPatientsBonus.sort(new TemperatureSorter().reversed());
        listOfPatientsBonus.forEach(System.out::println);
        System.out.println("\n\uD83D\uDFE1BONUS3\uD83D\uDFE1");
        listOfPatientsBonus.sort(new InsuranceSorter().reversed());
        listOfPatientsBonus.forEach(System.out::println);

        System.out.println("\n\uD83D\uDFE1BONUS priority\uD83D\uDFE1");
        Queue<Patient> priorityList = new LinkedList<>(listOfPatientsBonus);
        priorityList.forEach(System.out::println);
*/


    }
}
