package Les3;

public class TwoDimensionArrayExample1 {
    public static void main(String[] args) {
        int[][] array = new int[2][5];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[0][3] = 4;
        array[0][4] = 5;

        array[1][0] = 10;
        array[1][1] = 20;
        array[1][2] = 30;
        array[1][3] = 40;
        array[1][4] = 50;

        System.out.println(array[0][0]);
        System.out.println(array[1][4]);
    }
}