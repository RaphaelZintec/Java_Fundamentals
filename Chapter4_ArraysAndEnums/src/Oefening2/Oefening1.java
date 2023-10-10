package Oefening2;

public class Oefening1 {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int optelen = 0;
        for (int e : myArray){
            optelen += e;
        }
        System.out.println(optelen);
    }
}
