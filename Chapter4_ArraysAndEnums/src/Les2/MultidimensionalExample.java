package Les2;

public class MultidimensionalExample {
    public static void main(String[] args) {
        int[][] tab = {{1,2,3},{10,20,30}};
        int[][] tab2 = new int[2][3];
        tab2[0][1] = 1;
        tab2[0][2] = 2;
        tab2[0][3] = 3;
        tab2[1][1] = 10;
        tab2[1][2] = 20;
        tab2[1][3] = 30;
        /*for(int i = 0; i<tab.length; ++i){
            for(int i2=0; i2<tab[i].length; ++i){
                System.out.println(tab[i][i2]);
            }
        }
        */

    }
}
