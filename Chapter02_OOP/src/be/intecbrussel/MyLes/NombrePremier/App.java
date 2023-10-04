package be.intecbrussel.MyLes.NombrePremier;

public class App {
    public static void main(String[] args) {
        int start = 11;
        int end = 50;

        for(int i = start; i<=end; ++i){
            for (int divider = i-1; divider>=2; --divider ){
                if (i%divider == 0) {
                    break;
                }
                else if (divider == 2){
                    System.out.println(i);
                }
            }
        }

        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println(11%11);
        System.out.println(11%10);
        System.out.println(11%9);
        System.out.println(11%8);
        System.out.println(11%7);
        System.out.println(11%6);
        System.out.println(11%5);
        System.out.println(11%4);
        System.out.println(11%3);
        System.out.println(11%2);
        System.out.println(11%1);
    }
}
