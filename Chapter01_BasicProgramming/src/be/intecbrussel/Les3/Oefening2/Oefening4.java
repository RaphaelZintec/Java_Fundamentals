package be.intecbrussel.Les3.Oefening2;

public class Oefening4 {
    public static void main(String[] args) {
        //ERROR incompatible types: short shortNum = 24654654;
        //ERROR incompatible types: short shortNum = 24.50;
        //ERROR incompatible types: short shortNum = true;
        //ERROR incompatible types: boolean booVar = 0;

        short shortNum = 50;
        float floatNum = 10.99F;
        boolean booVar = false;

        System.out.println(floatNum += shortNum);
        System.out.println(shortNum += floatNum);
        //ERROR System.out.println(booVar += floatNum);
        //ERROR System.out.println(floatNum += booVar);
        //ERROR System.out.println(booVar += shortNum);
        //ERROR System.out.println(floatNum += booVar);

        System.out.println(floatNum -= shortNum);
        System.out.println(shortNum -= floatNum);

        System.out.println(floatNum *= shortNum);
        System.out.println(shortNum *= floatNum);

        System.out.println(floatNum /= shortNum);
        System.out.println(shortNum /= floatNum);

        System.out.println(floatNum %= shortNum);
        System.out.println(shortNum %= floatNum);
        //ERROR System.out.println(shortNum %= booVar);
        //ERROR System.out.println(floatNum %= booVar);
        //ERROR System.out.println(booVar %= shortNum);

        //ERROR System.out.println(++booVar);

        //ERROR System.out.println(booVar += true);

    }
}
