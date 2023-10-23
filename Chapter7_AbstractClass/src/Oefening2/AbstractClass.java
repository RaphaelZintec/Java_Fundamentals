package Oefening2;

public abstract class AbstractClass {
    //constructor
        public AbstractClass(){
            System.out.println("This is the constructor of abstract class");
        }

    //abstract method
        public abstract void aMethod();

    //normal method
        public void bMethod(){
            System.out.println("This is a normal method van abstract class");
        }
}
