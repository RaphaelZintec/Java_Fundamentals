package Les2;

public class JoinExample {
    public static void main(String[] args) {
        String[] strArray = {"intec", "Brussel", "is", "the", "best"};
        String str = String.join(" ", strArray);
        String str2 = String.join("-", strArray);
        System.out.println(str);
        System.out.println(str2);
    }
}
