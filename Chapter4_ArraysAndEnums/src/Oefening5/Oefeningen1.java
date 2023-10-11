package Oefening5;

public class Oefeningen1 {
    public static void main(String[] args) {
        int[][][] myArray = new int[5][5][5];
        int count = 0;
        for(int i=0; i<myArray.length; ++i){
            for(int i2=0; i2<myArray[i].length; ++i2){
                for(int i3=0; i3<myArray[i][i2].length; ++i3){
                    System.out.println((++count)+". "+myArray[i][i2][i3]);
                }
            }
        }
    }
}
