package Les2;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] myArray = {-100,2,356,-4,12,445,5,44,2};
        Arrays.sort(myArray,0,4);
        for (int e : myArray){
            System.out.println(e);
        }
        Arrays.sort(myArray);
        for (int e : myArray){
            System.out.println(e);
        }
    }
}
