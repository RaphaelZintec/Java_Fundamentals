package be.intecbrussel.Les5.Poo;

public class Cat implements Animal{
    @Override
    public void manger() {
        System.out.println("Cats eat wiskas");
    }
    public void dormir() {
        System.out.println("Cats sleep the whole day");
    }
}
