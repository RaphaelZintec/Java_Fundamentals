package Project3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Patient jimmyChoo = new Patient("990201321", "JIMMY CHOO", 42, 40, false, false);

        System.out.println("\n\uD83D\uDFE1Opdracht 1: LinkedHashSet (UNIQUE->Set + MAINTAIN ORDER->Linked)\uD83D\uDFE1");
        Set<Patient> list1 = new LinkedHashSet<>(Patient.getAllPatients());
        list1.add(jimmyChoo); //test add new patient to see the place array give
        list1.forEach(System.out::println);
        System.out.println("\uD83D\uDCCBTOTAL: "+list1.size()+" patients");

        System.out.println("\n\uD83D\uDFE1Opdracht 2: Order temperature then age DESC\uD83D\uDFE1");
        Comparator<Patient> compare1 = Comparator.comparing(Patient::getTemperature).thenComparing(Patient::getAge).thenComparing(Patient::getNationalRegistryNumber).reversed(); //if not adding compare registry number then TreeSet will remove value having same age and temperature
        Set<Patient> list2 = new TreeSet<>(compare1);
        list2.addAll(Patient.getAllPatients());
        list2.add(jimmyChoo); //test add new patient to see the place array give
        list2.forEach(System.out::println);
        System.out.println("\uD83D\uDCCBTOTAL: "+list2.size()+" patients");

        System.out.println("\n\uD83D\uDFE1BONUS: Order temperature then age then insurance DESC\uD83D\uDFE1");
        Comparator<Patient> compare2 = new TemperatureSorter().thenComparing(new AgeSorter()).thenComparing(new InsuranceSorter()).thenComparing(Patient::getNationalRegistryNumber).reversed(); //if not adding compare registry number then TreeSet will remove value having same age, temperature and insurance
        Set<Patient> listBonus = new TreeSet<>(compare2);
        listBonus.addAll(Patient.getAllPatients());
        Queue<Patient> listQueue = new PriorityQueue<>(listBonus);
        listQueue.add(jimmyChoo); //test add new patient to see the place array give
        listQueue.forEach(System.out::println);
        System.out.println("\uD83D\uDCCBTOTAL: "+listBonus.size()+" patients");

        System.out.println("\n\uD83D\uDFE1Opdracht 3\uD83D\uDFE1");
        List<Patient> list_3_1 = new ArrayList<>();     //1. (((patient.getAge<=65 && patient.getTemperature >=38) || patient.getTemperature()>=40) && patient.isUnknownVirus())
        Patient.getAllPatients().stream().filter(p->
                p.getTemperature()>=40 || ( (p.getAge()>=65 || p.getTemperature()>=38) && p.isUnknownVirus())
        ).sorted(Comparator.comparing(Patient::getTemperature).thenComparing(Comparator.comparing(Patient::getAge)).reversed()).distinct().forEach(list_3_1::add);

        List<Patient> list_3_2 = new ArrayList<>();     //2. fiver >= 38  && unknown virus
        Patient.getAllPatients().stream().filter(p->
                p.getTemperature()>=38 && p.isUnknownVirus()
        ).sorted(Comparator.comparing(Patient::getTemperature).reversed()).distinct().forEach(list_3_2::add);

        List<Patient> list_3_3 = new ArrayList<>();     //3. unknown virus
        Patient.getAllPatients().stream().filter(Patient::isUnknownVirus).sorted(Comparator.comparing(Patient::getTemperature).reversed()).distinct().forEach(list_3_3::add);

        List<Patient> list_3_4 = new ArrayList<>();     //4. fiver >= 38  && known virus
        Patient.getAllPatients().stream().filter(p->
                p.getTemperature()>=38 && !(p.isUnknownVirus())
        ).sorted(Comparator.comparing(Patient::getTemperature).reversed()).distinct().forEach(list_3_4::add);

        Map<Integer, List<Patient>> mapPatient = new HashMap<>();
        mapPatient.put(1,list_3_1);
        mapPatient.put(2,list_3_2);
        mapPatient.put(3,list_3_3);
        mapPatient.put(4,list_3_4);

        mapPatient.forEach((k, v)->{
            System.out.println("\n\t\uD83D\uDFE2Map "+k+"\uD83D\uDFE2");
            v.forEach(p-> System.out.println("\t"+p));
            System.out.println("\t\uD83D\uDCCBTOTAL: "+v.size()+" patients");
        });

    }
}
