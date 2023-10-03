package be.intecbrussel.MyLes.ObjectExample.Animals;

public class Animal {
    public static void main(String[] args) {
        Cat miaou = new Cat();
        Cat miaou2 = new Cat();
        Cat miaou3 = miaou2;

        System.out.println(miaou3);
    }
}
