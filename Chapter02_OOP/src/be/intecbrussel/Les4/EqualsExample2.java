package be.intecbrussel.Les4;

public class EqualsExample2 {
    public static void main(String[] args) {
        String str1 = "Hello intec";
        String str2 = new String("Hello intec");
        String str3 = str2;

        boolean equal1 = (str1 == str2);
        boolean equal2 = (str2 == str3);

        System.out.println(equal1);
        System.out.println(equal2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));


    }
}
