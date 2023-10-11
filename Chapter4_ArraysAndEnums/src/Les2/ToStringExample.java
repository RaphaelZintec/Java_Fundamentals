package Les2;

import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        String strArray = Arrays.toString(myArray);
        System.out.println("Array: "+strArray);
    }
}
