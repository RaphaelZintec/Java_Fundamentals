package be.intecbrussel.Les5.Oefening4;

public class Oefening3 {
    public static void main(String[] args) {
        int age = 0;
        do{
            if(age == 29) {
                System.out.println("Ik ben Raphael en ik ben " + age + " jaar");
                break;
            }
            ++age;
        }
        while(age <= 100);
    }
}
