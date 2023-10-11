package Oefening4;

import java.util.Arrays;

public class Oefening3 {
    public static void main(String[] args) {
        String[] myArray = {"New York", "Amsterdam", "London", "Brussel", "Paris", "Madrid", "Brussel", "Monaco", "Amsterdam", "Leuven"};

        //Show visited city twice 1 time
        //i=1 i2=8 -> Amsterdam
        //i=8 i2=8 -> Nothing because equal

        for (int i = 0; i < myArray.length; ++i){
            for (int i2 = i; i2 < myArray.length; ++i2){
                if(i!=i2 && myArray[i] == myArray[i2]){
                    System.out.println(myArray[i]);
                }
            }
        }

    }
}
