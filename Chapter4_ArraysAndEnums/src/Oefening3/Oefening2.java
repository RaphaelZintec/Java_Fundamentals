package Oefening3;

public class Oefening2 {
    public static void main(String[] args) {
        String[] firstArray  = {"Intec", "is", "the", "best!"};
        String[] secondArray = {"C#", "is", "the", "worst!"};
        String[] tempArray   = new String[4];

        for (int i = 0; i<firstArray.length && i<secondArray.length; ++i) {
            tempArray[i]   = firstArray[i];
            firstArray[i]  = secondArray[i];
            secondArray[i] = tempArray[i];
        }
        System.out.println("First Array values: ");
        for (String e : firstArray) {
            System.out.println(e);
        }
        System.out.println("Second Array values: ");
        for (String e : secondArray) {
            System.out.println(e);
        }
    }
}
