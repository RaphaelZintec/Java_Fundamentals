package be.intecbrussel.Les3;

public class MathExample3 {
    public static void main(String[] args) {

        //round up
        double result = Math.ceil(4.1);
        System.out.println(result);

        //round down
        result = Math.floor(10.9);
        System.out.println(result);

        //nombre au hasard
        result = Math.random() * (10 - 9 + 1) + 9;
        System.out.println(result);

        //puissance d'un nombre
        result = Math.pow(5,3);
        System.out.println(result);
    }
}
