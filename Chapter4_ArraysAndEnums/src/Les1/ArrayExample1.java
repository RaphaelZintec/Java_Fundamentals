package Les1;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] myArray1 = new int[10];
        int[] myArray2 = {10,20,30,40,50};
        int myArray3[] = new int[10];
        int myArray4[] = {10,20,30,40,50};

        System.out.println(myArray1[0]);
        myArray1[0] = 50;
        System.out.println(myArray1.length);
    }
}
