package Oefening1And2;

//OEFENING 1 & 2
public class MainApp {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        outerClass.setA(15);
        outerClass.setB(5);
        System.out.println(innerClass.sum());
        System.out.println(innerClass.min());
        System.out.println(innerClass.max());
        System.out.println(innerClass.product());
        System.out.println(innerClass.division());
    }
}
