package Project5.IcecreamShop.intecbrussel.application;

import Project5.IcecreamShop.intecbrussel.eatables.*;
import Project5.IcecreamShop.intecbrussel.sellers.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        //1. INITIALIZATION
        //- ICE CREAM PRICES: CONE:1.5 (per ball)   ROCKET:2,       MAGNUM:2.5  (alpine nuts:*1.5, strawberries:*1.7)
        //- PROFIT:           CONE:*0.25            ROCKET:*0.2     MAGNUM:*0.01
        //- STOCK:            CONE:0   (BALLS:2)    ROCKET:4        MAGNUM:4
        PriceList priceList             = new PriceList(1.5, 2.0, 2.5);
        /*Stock stock                     = new Stock(4, 0, 2, 4);
        IceCreamSeller iceCreamSeller   = new IceCreamCar(priceList, stock);
        ArrayList<Eatable> myIces       = new ArrayList<Eatable>();

        //2. PLACING ORDERS
        //- Profit starts with 0 and increment the next values:
        myIces.add(iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.LEMON})); //(1.5*2)*0.25  = 0.75
        myIces.add(iceCreamSeller.orderIceRocket());                                                    //2*0.20        = 0.4
        myIces.add(iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE));                       //2.5*0.01      = 0.025
        myIces.add(iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS));                           //(2.5*1.5)*0.01= 0.0375

        //3. SHOW eat() FOR EACH ICE CREAM AND try catch if null + SHOW PROFIT with toString()
        myIces.forEach(n->{
            try {
                n.eat();
            } catch(NullPointerException e){
                //do nothing
            }
        });
        System.out.println("\n"+iceCreamSeller);
*/
        //OPTIONAL BETTER STOCK FOR DIFFERENT MAGNUMS
        Map<Enum, Integer> magniMap     = new HashMap<>();
        magniMap.put(Magnum.MagnumType.MILKCHOCOLATE, 1);
        magniMap.put(Magnum.MagnumType.WHITECHOCOLATE, 1);
        magniMap.put(Magnum.MagnumType.BLACKCHOCOLATE, 0);
        magniMap.put(Magnum.MagnumType.ALPINENUTS, 1);
        magniMap.put(Magnum.MagnumType.ROMANTICSTRAWBERRIES, 1);
        Map<Enum, Integer> ballsMap     = new HashMap<>();
        ballsMap.put(Cone.Flavor.STRAWBERRY, 1);
        ballsMap.put(Cone.Flavor.BANANA, 0);
        ballsMap.put(Cone.Flavor.CHOCOLATE, 1);
        ballsMap.put(Cone.Flavor.VANILLA, 1);
        ballsMap.put(Cone.Flavor.LEMON, 1);
        ballsMap.put(Cone.Flavor.STRACIATELLA, 1);
        ballsMap.put(Cone.Flavor.MOKKA, 1);
        ballsMap.put(Cone.Flavor.PISTACHE, 1);
        Stock stockMap                  = new Stock(4, 1, ballsMap, magniMap);
        IceCreamSeller iceCreamSellerMap= new IceCreamCar(priceList, stockMap);
        ArrayList<Eatable> myIces2      = new ArrayList<Eatable>();

        //2. PLACING ORDERS
        //- Profit starts with 0 and increment the next values:
        myIces2.add(iceCreamSellerMap.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.LEMON})); //(1.5*2)*0.25  = 0.75
        myIces2.add(iceCreamSellerMap.orderIceRocket());                                                    //2*0.20        = 0.4
        myIces2.add(iceCreamSellerMap.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE));                       //2.5*0.01      = 0.025
        myIces2.add(iceCreamSellerMap.orderMagnum(Magnum.MagnumType.ALPINENUTS));                           //(2.5*1.5)*0.01= 0.0375

        //3. SHOW eat() FOR EACH ICE CREAM AND try catch if null + SHOW PROFIT with toString()
        myIces2.forEach(n->{
            try {
                n.eat();
            } catch(NullPointerException e){
                //do nothing
            }
        });
        System.out.println("\n"+iceCreamSellerMap);


    }
}
