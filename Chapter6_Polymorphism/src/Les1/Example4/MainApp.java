package Les1.Example4;

public class MainApp {
    public static void main(String[] args) {

        Parent parent = new Child();
        parent.name = "Intect brussel";

        System.out.println(parent.name);
        parent.method();

        //Child child = (Child) new Parent();
        Child child = (Child)parent;
        Parent parent2 = child;

        System.out.println(child.name);
        child.method();

        System.out.println(parent2);
        System.out.println(child);
        parent2.method();

    }
}
