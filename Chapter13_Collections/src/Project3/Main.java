package Project3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\uD83D\uDFE1Opdracht 1: LinkedHashSet ('UNIQUE'->Set + 'ADDING ORDER=ITERATION ORDER'->Linked)\uD83D\uDFE1");
        Set<Patient> listOfPatients1 = new LinkedHashSet<>(Patient.getAllPatients());
        listOfPatients1.forEach(System.out::println);

        System.out.println("\n\uD83D\uDFE1Opdracht 2: PriorityQueue ('PRIORITY=Virus unknown & Age desc')\uD83D\uDFE1");
        Queue<Patient> listOfPatients2 = new PriorityQueue<>(listOfPatients1);
        listOfPatients2.stream().sorted(Comparator.comparing(Patient::isUnknownVirus).reversed()).forEach(System.out::println); //here is virus order and age is in compareTo() of class Patient

        /*System.out.println("\n\uD83D\uDFE1Opdracht 3 BONUS: TreeSet ('UNIQUE'->Set + 'PRIORITY=Virus unknown & Age desc & ensured')\uD83D\uDFE1");
        Queue<Patient> listOfPatients3 = new PriorityQueue<>(Patient.getAllPatients());
        listOfPatients3.stream()
                .sorted(
                        Comparator.comparing(Patient::isUnknownVirus).reversed()
                                .thenComparing(
                                        Comparator.comparing((Patient p) -> p.getAge() < 50)
                                                .thenComparing(Comparator.comparing(Patient::isEnsured))
                                )
                ).forEach(System.out::println);

        //here is virus order and age is in compareTo() of class Patient
*/


    }
}
