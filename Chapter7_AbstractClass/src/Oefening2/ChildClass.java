package Oefening2;

public class ChildClass extends AbstractClass{
    //constructor
        public ChildClass(){
            super();
        }
    //override
        @Override
        public void aMethod() {
            System.out.println("This is abstract method");
        }
}
