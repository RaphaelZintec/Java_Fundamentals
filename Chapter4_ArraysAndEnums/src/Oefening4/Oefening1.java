package Oefening4;

import java.util.Arrays;

public class Oefening1 {
    public static void main(String[] args) {

        //init
        String[] strArray = {"Hello","my","name","is","Jhon","Do","and","i","am","20","years","old","i","like","pingpong"};
        double[] doubleArray = {56.15, 12.0, 100, 245, 48, 33.33, -15.25, 1548, 20.0, 73.5, 98.7, 5.55, 42.0, 88.2, 19.75};

        //sort
        Arrays.sort(strArray);
        Arrays.sort(doubleArray);

        //for string
        System.out.println("***SORT String***");
        for(int i = strArray.length-1; i>=0; --i){
            System.out.println(strArray[i]);
        }

        //for double
        System.out.println("\n***Double***");
        for(int i = doubleArray.length-1; i>=0; --i){
            System.out.println(doubleArray[i]);
        }
    }
}
