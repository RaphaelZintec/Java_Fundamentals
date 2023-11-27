package Project5.IcecreamShop.intecbrussel.application;

import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;

import java.util.ArrayList;

public class IceCreamApp {
    public static void main(String[] args) {
        //1. INITIALIZATION
        //- ICE CREAM PRICES: CONE:1.5 (per ball)   ROCKET:2,       MAGNUM:2.5  (alpine nuts:*1.5, strawberries:*1.7)
        //- PROFIT:           CONE:*0.25            ROCKET:*0.2     MAGNUM:*0.01
        PriceList priceList             = new PriceList(1.5, 2.0, 2.5);
        IceCreamSeller iceCreamSeller   = new IceCreamSalon(priceList);
        ArrayList<Eatable> myIces       = new ArrayList<Eatable>();

        //2. PLACING ORDERS
        //- Profit starts with 0 and increment the next values:
        myIces.add(iceCreamSeller.orderCone(new Cone.Flavor[]{Cone.Flavor.BANANA, Cone.Flavor.LEMON})); //(1.5*2)*0.25  = 0.75
        myIces.add(iceCreamSeller.orderIceRocket());                                                    //2*0.20        = 0.4
        myIces.add(iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE));                       //2.5*0.01      = 0.025
        myIces.add(iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS));                           //(2.5*1.5)*0.01= 0.0375

        //3. SHOW eat() FOR EACH ICE CREAM + SHOW PROFIT WITH toString()
        myIces.forEach(n->n.eat());
        System.out.println("\n"+iceCreamSeller);
    }
}
