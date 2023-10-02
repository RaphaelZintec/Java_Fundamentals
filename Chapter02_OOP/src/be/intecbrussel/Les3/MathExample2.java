package be.intecbrussel.Les3;

public class MathExample2 {
    public static void main(String[] args) {

        //kies de grootste
        int result01 = Math.max(10, 9);
        double result02 = Math.max(10.3, 9.6);
        long result03 = Math.max(17L, 8L);
        float result04 = Math.max(8F, 30.5F);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

        //kies de kleinste
        result01 = Math.min(10, 9);
        result02 = Math.min(10.3, 9.6);
        result03 = Math.min(17L, 8L);
        result04 = Math.min(8F, 30.5F);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
        System.out.println(result04);

    }
}
