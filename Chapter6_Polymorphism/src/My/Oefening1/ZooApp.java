package My.Oefening1;

public class ZooApp {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Snoopy");
        Animal animal2 = new Animal("Dingo");

        System.out.println(animal1.toString());
        System.out.println(animal2.toString());

        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());

        System.out.println(animal1.equals(animal2));


    }
}
