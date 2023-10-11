package Oefening3;

public class Oefening1 {
    public static void main(String[] args) {
        String myString = "Char Array!";
        char[] charArray = myString.toCharArray();
        for (int i = 0; i<charArray.length; ++i){
            System.out.print(
                    i == 0 || i == 4 ?
                    charArray[i] == ' ' ? i+" = | " : "|"+i+" = "+charArray[i]+" | "
                            : i+" = "+charArray[i]+" | ");
        }
    }
}
