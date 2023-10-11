package Les2;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int[] originalArray = {1,2,3};
        for (int i = 0; i<originalArray.length; ++i){
            System.out.println(originalArray[i]+" ");
        }

        int[] newArray = Arrays.copyOf(originalArray,5);
        for (int i = 0; i<newArray.length; ++i){
            System.out.println(newArray[i]+" ");
        }

        int[] newArray2 = originalArray;
        System.out.println(originalArray);
        System.out.println(newArray);
        System.out.println(newArray2);
        originalArray[0] = 44;
        System.out.println(originalArray[0]);
        System.out.println(newArray2[0]);
    }
}
