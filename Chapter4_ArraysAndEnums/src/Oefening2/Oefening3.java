package Oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};
        double gemiddeldGetal = 0;
        for(int i=0; i<numbers.length; ++i){
            gemiddeldGetal += numbers[i];
        }
        System.out.println(gemiddeldGetal / numbers.length);
    }
}
