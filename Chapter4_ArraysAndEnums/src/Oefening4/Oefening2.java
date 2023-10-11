package Oefening4;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5};
        int[] myIntArray2 = Arrays.copyOf(myIntArray,10);

        //test
        System.out.println(myIntArray.length);
        System.out.println(myIntArray2.length);

    }
}
