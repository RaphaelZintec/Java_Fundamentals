package be.intecbrussel.Opdracht1;

public class ForExample6 {
    public static void main(String[] args) {
        String result = "";
        for(int i = -10; i <= 10; ++i){
            System.out.println(i>0 ? "+"+i : i);
        }
    }
}
