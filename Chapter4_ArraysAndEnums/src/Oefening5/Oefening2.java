package Oefening5;

import java.util.Arrays;

public class Oefening2 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        String[] strArray = {Arrays.toString(numbers[0]),Arrays.toString(numbers[1])};

        //1
        /*for(String str : strArray){
            System.out.print(str);
        }*/

        //2
        String str = String.join(", ",strArray);
        System.out.println(str);
    }
}
