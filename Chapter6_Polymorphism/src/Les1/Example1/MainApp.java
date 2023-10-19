package Les1.Example1;

public class MainApp {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.animalSound();

        Animal myCat = new Cat();
        //Cat myCat = new Cat();
        myCat.animalSound();
        //myCat.animalSound2();

        Animal myDuck = new Duck();
        myDuck.animalSound();
    }
}
