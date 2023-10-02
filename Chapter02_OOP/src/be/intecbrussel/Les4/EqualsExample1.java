package be.intecbrussel.Les4;

public class EqualsExample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = 5.5;

        boolean equal1 = (a==b);
        boolean equal2 = (a==c);

        System.out.println(equal1);
        System.out.println(equal2);

        String s1 = "intec";
        String s2 = "intec";
        String s3 = "INTEC";
        String s4 = "Java";

        boolean equal01 = (s1 == s2);
        boolean equal02 = (s2 == s3);
        boolean equal03 = (s3 == s4);
        boolean equal04 = (s3 == "INTEC");

        System.out.println(equal01);
        System.out.println(equal02);
        System.out.println(equal03);
        System.out.println(equal04);

        StringBuilder strBuild = new StringBuilder("INTEC");
        StringBuilder strBuild2 = new StringBuilder("INTEC2");
        StringBuilder strBuild3 = new StringBuilder("INTEC");

        boolean equal05 = (strBuild == strBuild2);
        boolean equal06 = (strBuild == strBuild3);
        System.out.println(equal05);
        System.out.println(equal06);

    }
}
