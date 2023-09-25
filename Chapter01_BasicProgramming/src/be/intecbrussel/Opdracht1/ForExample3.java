package be.intecbrussel.Opdracht1;

public class ForExample3 {
    public static void main(String[] args) {

        int num = 11;
        int result = 1;

        for(int i = 1; true; ++i){
            result = 1;
            for(int y = 1; y<=i; ++y){
                result *= num;
            }
            if(result >= 10000){
                break;
            }
            System.out.println(result);
        }
    }
}
