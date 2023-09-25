package be.intecbrussel.Les4;

public class SwitchExample2 {
    public static void main(String[] args) {
        String str = "Jhon";

        switch(str) {
            case "Elena":
                System.out.println("Hello Elena");
            case "Dylan":
                System.out.println("Hello Dylan");
            case "Jhon":
                System.out.println("Hello Jhon");
            case "Bob":
                System.out.println("Hello Bob");
            case "Stefan":
                System.out.println("Hello Stefan");
            default:
                System.out.println("Hello again");
        }


    }
}
