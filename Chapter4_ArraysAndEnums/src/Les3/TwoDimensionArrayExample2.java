package Les3;

public class TwoDimensionArrayExample2 {
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

        /*for(int i = 0; i < array.length; ++i){
            for(int i2 = 0; i2 < array[i].length; ++i2){
                System.out.println(array[i][i2]);
            }
        }*/

        for (int[] eTab : array){
            for(int e : eTab){
                System.out.println(e);
            }
        }


    }
}
