package Les2;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] tab = {300,200,500,400,100};
        Arrays.sort(tab);
        System.out.println(Arrays.binarySearch(tab,500));
    }
}
