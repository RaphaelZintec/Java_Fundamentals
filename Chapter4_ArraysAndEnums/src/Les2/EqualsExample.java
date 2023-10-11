package Les2;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {1,2,3,4};
        int[] array3 = {4,3,2,1};
        int[] array4 = {1,2,3,4,5};
        long[] array5 = {1,2,3,4};

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));
        System.out.println(Arrays.equals(array1, array4));
        //System.out.println(Arrays.equals(array1, array5));
    }
}
