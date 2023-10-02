package be.intecbrussel.Les4;

public class EqualsExample3 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";

        System.out.println("s1 and s2 are equal: "+(s1==s2));
        System.out.println("s1 and s3 are equal: "+(s1==s3));
        System.out.println("s2 and s3 are equal: "+(s2.equals(s3)));
        System.out.println("s3 and s1 are equal: "+(s3.equals(s1)));

        s3 = s2;
        System.out.println("s3 and s2 are equal: "+(s3==s2));
    }
}
