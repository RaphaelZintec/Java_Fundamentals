package be.intecbrussel.Les5.Poo;

public class Zoo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Cat myCat2 = new Cat();

        myDog.manger();
        myCat.manger();
        myCat2.dormir();
        myCat2.manger();
    }
}
