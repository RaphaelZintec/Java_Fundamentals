package Les1;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;

        for (int i = 0; i < myArray.length; ++i){
            System.out.println(myArray[i]);
        }
        for (int elements : myArray){
            System.out.println(elements);
        }
    }
}
