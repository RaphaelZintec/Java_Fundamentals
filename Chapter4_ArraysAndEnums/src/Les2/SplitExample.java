package Les2;

public class SplitExample {
    public static void main(String[] args) {
        String str = "hello bob how are you";
        String[] strArray = str.split(" ");
        for (String e: strArray){
            System.out.println(e);
        }
    }
}
