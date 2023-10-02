package be.intecbrussel.Les1;

public class StringExample {
    public static void main(String[] args) {
        String name = "raphaël";
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println(name.toLowerCase());

        System.out.println(name.length());
        System.out.println(name.isBlank());
        System.out.println(name.replace("A", "b"));
        System.out.println(name.replaceAll("PH","jujuju"));

        String ex2 = "           Hello World        ";
        System.out.println(ex2.strip());
        System.out.println(ex2.stripLeading());
        System.out.println(ex2.stripTrailing());

        String ex3 = "Exemple12345";
        System.out.println(ex3.indexOf("World"));
        System.out.println(ex3.contains("World"));
        System.out.println(ex3.substring(6,10));
    }
}
