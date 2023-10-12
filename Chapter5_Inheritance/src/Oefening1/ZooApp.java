package Oefening1;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Wiskas","Tom",10);
        Dog dog = new Dog("Playing with the ball", "Snoopy", 3);
        Rat rat = new Rat("Salmonellose", 5);

        //First Animal
        System.out.println("Name: "+cat.getName());
        System.out.println("Age: "+cat.getAge());
        System.out.println("Food: "+cat.getFood());

        //Second Animal
        System.out.println("\nName: "+dog.getName());
        System.out.println("Age: "+dog.getAge());
        System.out.println("Hobby: "+dog.getHobby());

        //Third Animal
        System.out.println("\nName: "+rat.getName());
        System.out.println("Age: "+rat.getAge());
        System.out.println("Food: "+rat.getDisease());
    }
}
