package Les2;

public class ToCharArrayExample {
    public static void main(String[] args) {
        String str = "hello how are you";
        char[] charArray = str.toCharArray();
        for (char e : charArray ) {
            System.out.print(e+" | ");
        }
    }
}
